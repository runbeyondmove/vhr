package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.EmployeeremoveMapper;
import org.javaboy.vhr.model.Employeeremove;
import org.javaboy.vhr.model.EmployeeremoveVo;
import org.javaboy.vhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xianfuhao on 2019/12/20.
 */
@Service
@Transactional
public class MoveService {

    @Autowired
    EmployeeremoveMapper employeeremoveMapper;

    /**
     * 获取所有
     * @return
     */
    public List<EmployeeremoveVo> getAllMove(String keywords, Integer page, Integer size) {

//        List<EmployeeremoveVo> employeeremoveList = employeeremoveMapper.getAllMove();
//        return employeeremoveList;
        int start = (page - 1) * size;
        List<EmployeeremoveVo> employeeremoveList = employeeremoveMapper.selectByKey(start,size,keywords);
        return employeeremoveList;
    }

    public int updateMove(Employeeremove employeeremove) {
        return employeeremoveMapper.updateByPrimaryKeySelective(employeeremove);
    }

    public int addMove(Employeeremove employeeremove) {
        return employeeremoveMapper.insert(employeeremove);
    }


    public int deleteMove(String ids) {
        String[] split = ids.split(",");
        return employeeremoveMapper.deleteMove(split);
    }

    public List<Position> getJobs() {
        return null;
    }

    public Long getCountByKeywords(String keywords, Integer start, Integer size) {
        return employeeremoveMapper.getCountByKeywords(start,size,keywords);
    }
}
