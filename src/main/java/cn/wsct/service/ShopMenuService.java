package cn.wsct.service;

import java.util.List;
import java.util.Map;

import cn.wsct.pojo.Order;
import cn.wsct.pojo.ShopMenu;

public interface ShopMenuService {

	//查询商店菜品
	public List<Map<String, Object>> selectShopMenu(String sTelephone,String currPage,String pageSize);
	
	//修改商品信息
	public int updateMenuInfo(ShopMenu shopMenu);
	
	//根据smid查询商品
	public List<ShopMenu> selectMenuBySmId(String smId);
	
	//操作商品上架下架（库存）
	public int operatingCommodities(String smId,String smStock);
	
	//查询未完成订单
	public List<Map<String, Object>> selectNewOrders(String sTelephone);
	
}
