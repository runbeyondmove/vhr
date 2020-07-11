package org.javaboy.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.Employeeec;
import org.javaboy.vhr.model.EmployeeecExcelVo;

import java.util.List;

public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);

    List<Employee> getAllEmps();

    int deleteEC(@Param("ids") String[] ids);

    List<Employeeec> selectByKey(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords);

    Long getCountByKeywords(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords);

    int addAwards(@Param("awards") List<Employeeec> awards);

    List<EmployeeecExcelVo> selectByKeyForExcel(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords);
}