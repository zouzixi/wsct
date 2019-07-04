package cn.wsct.service;

import java.util.List;
import java.util.Map;

import cn.wsct.pojo.Evaluate;
import cn.wsct.pojo.Order;
import cn.wsct.pojo.Region;
import cn.wsct.pojo.Shop;
import cn.wsct.pojo.ShopMenu;

public interface IndexService {

	//查询订单列表，放置公告栏
	public List<Order> selectList();
	
	//查询城市
	public List<Region> selectRegions();
	
	//查询菜品
	public List<ShopMenu> selectShopMenu();
	
	//查询商店
	public List<Shop> selectShop();
	
	//查询商店
	public List<Shop> selectShops();
	
	//查询评论
	public List<Map<String, Object>> selecteEvaluates();
	
	//根据商品分类查询商品
	public List<Shop> selectClassifiedCommodities(String sClassification);
	
	//根据手机号查找
	public List<Shop> selectShopBytelephone(String telephone);
	
}
