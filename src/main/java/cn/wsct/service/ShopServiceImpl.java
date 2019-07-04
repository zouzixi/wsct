package cn.wsct.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wsct.dao.ShopMapper;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopMapper shopMapper;
	
	//修改商铺信息
	@Override
	public int updateShopInfo(String sShopname,String sAddress,String sTelephone,String sIntroduce,String sImage,String oldPhone) {
		return shopMapper.updateShopInfo(sShopname, sAddress, sTelephone, sIntroduce, sImage, oldPhone);
	}

}
