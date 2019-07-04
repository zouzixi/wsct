package cn.wsct.service;

import org.apache.ibatis.annotations.Param;

public interface ShopService {

	//修改商铺信息
	public int updateShopInfo(String sShopname,String sAddress,String sTelephone,String sIntroduce,String sImage,String oldPhone);
	
}
