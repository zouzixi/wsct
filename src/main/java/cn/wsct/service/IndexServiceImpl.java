package cn.wsct.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wsct.dao.EvaluateMapper;
import cn.wsct.dao.OrderMapper;
import cn.wsct.dao.RegionMapper;
import cn.wsct.dao.ShopMapper;
import cn.wsct.dao.ShopMenuMapper;
import cn.wsct.pojo.Evaluate;
import cn.wsct.pojo.Order;
import cn.wsct.pojo.OrderExample;
import cn.wsct.pojo.Region;
import cn.wsct.pojo.RegionExample;
import cn.wsct.pojo.Shop;
import cn.wsct.pojo.ShopExample;
import cn.wsct.pojo.ShopExample.Criteria;
import cn.wsct.pojo.ShopMenu;
import cn.wsct.pojo.ShopMenuExample;
import cn.wsct.util.RandomValue;

@Service
public class IndexServiceImpl implements IndexService{

	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private RegionMapper regionMapper;
	
	@Autowired
	private ShopMenuMapper shopMenuMapper;
	
	@Autowired
	private ShopMapper shopMapper;
	
	@Autowired
	private EvaluateMapper evaluateMapper;
	
	//查询订单列表
	@Override
	public List<Order> selectList() {
		OrderExample example = new OrderExample();
		List<Order> list = orderMapper.selectByExample(example);
		return list;
	}

	//查询区域
	@Override
	public List<Region> selectRegions() {
		RegionExample example = new RegionExample();
		List<Region> list = regionMapper.selectByExample(example);
		return list;
	}

	
	//查询随机菜品
	@Override
	public List<ShopMenu> selectShopMenu() {
		ShopMenuExample example = new ShopMenuExample();
		List<ShopMenu> preList = shopMenuMapper.selectByExample(example);
		List<ShopMenu> list = RandomValue.randomTopic(preList, 3);
		return list;
	}
	
	//查询随机商品
	@Override
	public List<Shop> selectShop() {
		ShopExample example = new ShopExample();
		List<Shop> preList = shopMapper.selectByExample(example);
		List<Shop> list = RandomValue.randomTopic(preList, 5);
		return list;
	}	

	//查询随机商品
	@Override
	public List<Shop> selectShops() {
		ShopExample example = new ShopExample();
		List<Shop> preList = shopMapper.selectByExample(example);
		List<Shop> list = RandomValue.randomTopic(preList, 6);
		return list;
	}

	//查询评论
	@Override
	public List<Map<String, Object>> selecteEvaluates() {
		List<Map<String, Object>> list = evaluateMapper.selectEvaluate();
		return list;
	}

	//分类查询商铺
	@Override
	public List<Shop> selectClassifiedCommodities(String sClassification) {
		ShopExample example = new ShopExample();
		Criteria criteria = example.createCriteria();
		criteria.andSClassificationEqualTo(sClassification);
		List<Shop> preList = shopMapper.selectByExample(example);
		List<Shop> list = RandomValue.randomTopic(preList, 6);
		return list;
	}

	//根据手机号判断是否为商家
	@Override
	public List<Shop> selectShopBytelephone(String telephone) {
		ShopExample example = new ShopExample();
		Criteria criteria = example.createCriteria();
		criteria.andSTelephoneEqualTo(telephone);
		List<Shop> list = shopMapper.selectByExample(example);
		return list;
	}	
}
