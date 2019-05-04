package cn.wsct.dao;

import cn.wsct.pojo.Region;
import cn.wsct.pojo.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    int countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    Region selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}