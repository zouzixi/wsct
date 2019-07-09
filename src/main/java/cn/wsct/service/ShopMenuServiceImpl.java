package cn.wsct.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.wsct.dao.OrderMapper;
import cn.wsct.dao.ShopMenuMapper;
import cn.wsct.pojo.Order;
import cn.wsct.pojo.OrderExample;
import cn.wsct.pojo.ShopMenu;
import cn.wsct.pojo.ShopMenuExample;
import cn.wsct.pojo.ShopMenuExample.Criteria;

@Service
public class ShopMenuServiceImpl implements ShopMenuService{

	@Autowired
	private ShopMenuMapper shopMenuMapper;
	
	@Autowired
	private OrderMapper orderMapper;
	
	//查询商品信息
	@Override
	public List<Map<String, Object>> selectShopMenu(String sTelephone,String currPage,String pageSize) {
		int currentPage = Integer.parseInt(currPage);
		int pageSizes = Integer.parseInt(pageSize);
		PageHelper.startPage(currentPage, pageSizes);
		List<Map<String, Object>> list = shopMenuMapper.selectShopMenu(sTelephone);
		//PageInfo info = new PageInfo<>(list);
		return list;
	}

	//修改商品信息
	@Override
	public int updateMenuInfo(ShopMenu shopMenu) {
		return shopMenuMapper.updateByPrimaryKey(shopMenu);
	}

	//根据smid查询商品
	@Override
	public List<ShopMenu> selectMenuBySmId(String smId) {
		int smIds = Integer.parseInt(smId);
		ShopMenuExample example = new ShopMenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andSmIdEqualTo(smIds);
		return shopMenuMapper.selectByExample(example);
	}

	//操作商品上架下架（库存）
	@Override
	public int operatingCommodities(String smId, String smStock) {
		return shopMenuMapper.operatingCommodities(smId, smStock);
	}

	//查询未完成订单
	@Override
	public List<Map<String, Object>> selectNewOrders(String sTelephone) {
		return orderMapper.selectNewOrders(sTelephone);
	}
	
	

}
