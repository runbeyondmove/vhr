package org.javaboy.vhr.service;

import example.HrDictExample;
import org.javaboy.vhr.mapper.HrDictMapper;
import org.javaboy.vhr.model.HrDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DictService {

    @Autowired
    HrDictMapper hrDictMapper;

    public List<HrDict> getDictByDesc(String desc) {
        //创建查询对象
        HrDictExample example = new HrDictExample();
        //设置查询条件
        example.createCriteria().andDescEqualTo(desc);
        List<HrDict> list = hrDictMapper.selectByExample(example);
        return list;

    }

    public List<HrDict> getAllDict() {
        HrDictExample example = new HrDictExample();
        List<HrDict> list = hrDictMapper.selectByExample(example);
        return list;
    }
}
