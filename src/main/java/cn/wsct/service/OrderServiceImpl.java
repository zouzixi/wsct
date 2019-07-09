package cn.wsct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wsct.dao.OrderMapper;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	//商家发货
	@Override
	public int deliverGoods(String oId) {
		return orderMapper.deliverGoods(oId);
	}

}
