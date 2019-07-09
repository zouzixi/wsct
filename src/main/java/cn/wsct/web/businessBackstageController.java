package cn.wsct.web;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.wsct.dao.ShopMapper;
import cn.wsct.dao.ShopMenuMapper;
import cn.wsct.pojo.ShopMenu;
import cn.wsct.pojo.User;
import cn.wsct.service.OrderService;
import cn.wsct.service.ShopMenuService;
import cn.wsct.service.ShopService;
import cn.wsct.service.UserService;

@RequestMapping("/businessBackstageController")
@Controller
public class businessBackstageController {

	@Autowired
	private ShopService shopService;
	
	@Autowired
	private ShopMenuService shopMenuService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderService orderService;
	
	//修改商铺信息
	@RequestMapping("/updateShopInfo")
	public String updateShopInfo(@RequestParam("sImage") MultipartFile image,String sShopname,String sAddress,String sTelephone,String sIntroduce,HttpServletRequest request,HttpSession session){
		User user = (User) session.getAttribute("user");
		String oldPhone = user.getuTelephone();
		String path = request.getServletContext().getRealPath("upload");//获取upload在文件夹中的地址
		String oldName = image.getOriginalFilename();
		String newName = UUID.randomUUID()+oldName;
		String finalName = "upload\\"+newName;
		File file = new File(path+"/"+newName);
		try {
			image.transferTo(file);//上传图片
			shopService.updateShopInfo(sShopname, sAddress, sTelephone, sIntroduce, finalName, oldPhone);
			return "1";
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	
	//查询商铺菜单
	@ResponseBody
	@RequestMapping("/selectShopMenu")
	public Map<String, Object> selectShopMenu(HttpSession session,String currPage,String pageSize){
		Map<String, Object> map = new HashMap<>();
		User user = (User) session.getAttribute("user");
		String telephone = user.getuTelephone();
		List<Map<String, Object>> list = shopMenuService.selectShopMenu(telephone, currPage, pageSize);
		map.put("list", list);
		return map;
	}
	
	//修改商户密码
	@ResponseBody
	@RequestMapping("/updatePassword")
	public String updatePassword(String oldPassword,String newPassword,HttpSession session){
		User user = (User) session.getAttribute("user");
		if(!oldPassword.equals("") && !newPassword.equals("") && !user.getuTelephone().equals("")) {
			String finalPassword = DigestUtils.md5Hex(newPassword);
			user.setuPassword(finalPassword);
			userService.updatePassword(user);
			return "1";
		}
		return "0";
	}
	
	//修改商品信息
	@ResponseBody
	@RequestMapping("/updateMenuInfo")
	public Map<String, Object> updateMenuInfo(@RequestParam("smImage") MultipartFile image,String smDishname,String smPrice,String smStock,String smDetails,String smId,HttpServletRequest req,HttpSession session){
		Map<String, Object> map = new HashMap<>();
		if(!smDishname.equals("") && !smPrice.equals("") && !smStock.equals("") && !smDetails.equals("")) {
			Double smPrices = (double) Integer.parseInt(smPrice);
			int smStocks = Integer.parseInt(smStock);
			ShopMenu shopMenu = (ShopMenu) session.getAttribute("menu");
			String path = req.getServletContext().getRealPath("upload");//获取upload在文件夹中的地址
			String oldName = image.getOriginalFilename();
			String newName = UUID.randomUUID()+oldName;
			String finalName = "upload\\"+newName;
			File file = new File(path+"/"+newName);
			try {
				image.transferTo(file);
				shopMenu.setSmDishname(smDishname);
				shopMenu.setSmPrice(smPrices);
				shopMenu.setSmStock(smStocks);
				shopMenu.setSmDetails(smDetails);
				shopMenu.setSmImage(finalName);
				shopMenuService.updateMenuInfo(shopMenu);
				map.put("msg", "1");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
			map.put("msg", "2");
		}
		return map;
	}
	
	//根据商品id预填充
	@ResponseBody
	@RequestMapping("/selectMenuBySmId")
	public Map<String, Object> selectMenuBySmId(String smId,HttpSession session){
		Map<String, Object> map = new HashMap<>();
		List<ShopMenu> list = shopMenuService.selectMenuBySmId(smId);
		if(list != null && list.size() > 0) {
			session.setAttribute("menu", list.get(0));
			map.put("list", list);
		}
		return map;
	}
	
	//上架下架
	@ResponseBody
	@RequestMapping("/operatingCommodities")
	public Map<String, Object> operatingCommodities(String smId,String smStock){
		Map<String, Object> map = new HashMap<>();
		if(!smId.equals("") && !smStock.equals("")) {
			shopMenuService.operatingCommodities(smId, smStock);
			map.put("msg", "1");
		}
		return map;
	}
	
	//查询新订单
	@ResponseBody
	@RequestMapping("/selectNewOrders")
	public Map<String, Object> selectNewOrders(HttpSession session){
		Map<String, Object> map = new HashMap<>();
		User user = (User) session.getAttribute("user");
		List<Map<String, Object>> list = shopMenuService.selectNewOrders(user.getuTelephone());
		map.put("list", list);
		return map;
	}
	
	//商家发货
	@ResponseBody
	@RequestMapping("/deliverGoods")
	public Map<String, Object> deliverGoods(String oId){
		Map<String, Object> map = new HashMap<>();
		if(!oId.equals("")) {
			orderService.deliverGoods(oId);
			map.put("msg", "1");
		}
		return map;
	}
	
}
