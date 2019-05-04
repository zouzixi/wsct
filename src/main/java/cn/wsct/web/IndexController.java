package cn.wsct.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wsct.pojo.Evaluate;
import cn.wsct.pojo.Order;
import cn.wsct.pojo.Region;
import cn.wsct.pojo.Shop;
import cn.wsct.pojo.ShopMenu;
import cn.wsct.service.IndexService;
import cn.wsct.util.RandomValue;

@RequestMapping("/index")
@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	//公告栏获取订单信息
	@ResponseBody
	@RequestMapping("/selectList")
	public Map<String, Object> selectList(){
		Map<String, Object> map = new HashMap<>();
		List<Order> list = indexService.selectList();
		map.put("list", list);
		return map;
	}
	
	//遍历城市地区
	@ResponseBody
	@RequestMapping("/selectRegions")
	public Map<String, Object> selectRegions(){
		Map<String, Object> map = new HashMap<>();
		List<Region> list = indexService.selectRegions();
		map.put("list", list);
		return map;
	}
	
	
	//主页点菜区
	@ResponseBody
	@RequestMapping("/selectShopMenu")
	public Map<String, Object> selectShopMenu(){
		Map<String, Object> map = new HashMap<>();
		List<ShopMenu> list = indexService.selectShopMenu();
		map.put("list", list);
		return map;
	}
	
	//商铺展示
	@ResponseBody
	@RequestMapping("/selectShop")
	public Map<String, Object> selectShop(){
		Map<String, Object> map = new HashMap<>();
		List<Shop> list = indexService.selectShop();
		map.put("list", list);
		return map;
	}
	
	//商铺展示
	@ResponseBody
	@RequestMapping("/selectShops")
	public Map<String, Object> selectShops(){
		Map<String, Object> map = new HashMap<>();
		List<Shop> list = indexService.selectShops();
		map.put("list", list);
		return map;
	}
	
	//获取评论
	@ResponseBody
	@RequestMapping("/selecteEvaluates")
	public Map<String, Object> selecteEvaluates(){
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> preList = indexService.selecteEvaluates();
		List list = RandomValue.randomTopic(preList, 2);
		map.put("list", list);
		return map;
	}
	
	//根据商铺分类
	@ResponseBody
	@RequestMapping("/selectClassifiedCommodities/{classification}")
	public Map<String, Object> selectClassifiedCommodities(@PathVariable String classification){
		Map<String, Object> map = new HashMap<>();
		if(!classification.equals("")&&classification.equals("chineseFood")) {
			List<Shop> list = indexService.selectClassifiedCommodities("中餐");
			map.put("list", list);
		}else if(!classification.equals("")&&classification.equals("europeanFood")){
			
			
		}else if(!classification.equals("")&&classification.equals("dessert")) {
			
		}else if(!classification.equals("")&&classification.equals("barbecue")) {
			
		}else if(!classification.equals("")&&classification.equals("fruits")) {
			
		}else if(!classification.equals("")&&classification.equals("japaneseCuisine")) {
			
		}
		
		return map;
	}
	
	
}
