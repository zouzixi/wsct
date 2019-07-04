package cn.wsct.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.wsct.dao.ShopMenuMapper;

@Service
public class ShopMenuServiceImpl implements ShopMenuService{

	@Autowired
	private ShopMenuMapper shopMenuMapper;
	
	@Override
	public List<Map<String, Object>> selectShopMenu(String sTelephone,String currPage,String pageSize) {
		int currentPage = Integer.parseInt(currPage);
		int pageSizes = Integer.parseInt(pageSize);
		PageHelper.startPage(currentPage, pageSizes);
		List<Map<String, Object>> list = shopMenuMapper.selectShopMenu(sTelephone);
		//PageInfo info = new PageInfo<>(list);
		return list;
	}

}
