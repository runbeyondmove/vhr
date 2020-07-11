package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.AdjustSalaryMapper;
import org.javaboy.vhr.model.AdjustSalary;
import org.javaboy.vhr.model.AdjustSalaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xianfuhao on 2019/12/20.
 */
@Service
@Transactional
public class AdjustsalaryService {

    @Autowired
    AdjustSalaryMapper adjustSalaryMapper;

    /**
     * 获取所有惩戒数据
     * @return
     */
    public List<AdjustSalaryVo> getAllAdjustsalary(String keywords,Integer page,Integer size) {
//        AdjustsalaryExample example = new AdjustsalaryExample();
//        List<Adjustsalary> adjustsalaryList = adjustsalaryMapper.selectByExample(example);
        int start = (page - 1) * size;
        List<AdjustSalaryVo> adjustsalaryList = adjustSalaryMapper.selectByKey(start,size,keywords);
        return adjustsalaryList;
    }

    public int updateAdjustsalary(AdjustSalary adjustsalary) {
        return adjustSalaryMapper.updateByPrimaryKeySelective(adjustsalary);
    }

    public int addAdjustsalary(AdjustSalary adjustsalary) {
        return adjustSalaryMapper.insert(adjustsalary);
    }

    public int deleteAdjustsalary(String ids) {
        String[] split = ids.split(",");
        return adjustSalaryMapper.deleteAdjustsalary(split);
    }

    public Long getCountByKeywords(String keywords, Integer start, Integer size) {
        return adjustSalaryMapper.getCountByKeywords(start,size,keywords);
    }
}
