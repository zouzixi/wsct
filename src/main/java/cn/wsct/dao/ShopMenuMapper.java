package cn.wsct.dao;

import cn.wsct.pojo.ShopMenu;
import cn.wsct.pojo.ShopMenuExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ShopMenuMapper {
    int countByExample(ShopMenuExample example);

    int deleteByExample(ShopMenuExample example);

    int deleteByPrimaryKey(Integer smId);

    int insert(ShopMenu record);

    int insertSelective(ShopMenu record);

    List<ShopMenu> selectByExample(ShopMenuExample example);

    ShopMenu selectByPrimaryKey(Integer smId);

    int updateByExampleSelective(@Param("record") ShopMenu record, @Param("example") ShopMenuExample example);

    int updateByExample(@Param("record") ShopMenu record, @Param("example") ShopMenuExample example);

    int updateByPrimaryKeySelective(ShopMenu record);

    int updateByPrimaryKey(ShopMenu record);
    
    List<Map<String, Object>> selectShopMenu(@Param("sTelephone") String sTelephone);
    
}