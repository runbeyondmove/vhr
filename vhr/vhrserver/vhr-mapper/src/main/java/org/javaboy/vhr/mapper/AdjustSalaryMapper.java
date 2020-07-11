package org.javaboy.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.javaboy.vhr.model.AdjustSalary;
import org.javaboy.vhr.model.AdjustSalaryVo;

import java.util.List;

public interface AdjustSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdjustSalary record);

    int insertSelective(AdjustSalary record);

    AdjustSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdjustSalary record);

    int updateByPrimaryKey(AdjustSalary record);

    int deleteAdjustsalary(@Param("ids") String[] ids);

    List<AdjustSalaryVo> selectByKey(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords);

    Long getCountByKeywords(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords);
}