package cn.wsct.service;

import java.util.List;
import java.util.Map;

public interface ShopMenuService {

	public List<Map<String, Object>> selectShopMenu(String sTelephone,String currPage,String pageSize);
	
}
