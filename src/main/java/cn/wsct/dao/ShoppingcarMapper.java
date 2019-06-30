package cn.wsct.dao;

import cn.wsct.pojo.Shoppingcar;
import cn.wsct.pojo.ShoppingcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcarMapper {
    int countByExample(ShoppingcarExample example);

    int deleteByExample(ShoppingcarExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(Shoppingcar record);

    int insertSelective(Shoppingcar record);

    List<Shoppingcar> selectByExample(ShoppingcarExample example);

    Shoppingcar selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") Shoppingcar record, @Param("example") ShoppingcarExample example);

    int updateByExample(@Param("record") Shoppingcar record, @Param("example") ShoppingcarExample example);

    int updateByPrimaryKeySelective(Shoppingcar record);

    int updateByPrimaryKey(Shoppingcar record);
}