package cn.wsct.web;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.wsct.dao.ShopMapper;
import cn.wsct.dao.ShopMenuMapper;
import cn.wsct.pojo.User;
import cn.wsct.service.ShopMenuService;
import cn.wsct.service.ShopService;

@RequestMapping("/businessBackstageController")
@Controller
public class businessBackstageController {

	@Autowired
	private ShopService shopService;
	
	@Autowired
	private ShopMenuService shopMenuService;
	
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
	
	@ResponseBody
	@RequestMapping("selectShopMenu")
	public Map<String, Object> selectShopMenu(HttpSession session,String currPage,String pageSize){
		//System.out.println(currPage);
		Map<String, Object> map = new HashMap<>();
		User user = (User) session.getAttribute("user");
		String telephone = user.getuTelephone();
		List<Map<String, Object>> list = shopMenuService.selectShopMenu(telephone, currPage, pageSize);
		map.put("list", list);
		return map;
	}
	
}
