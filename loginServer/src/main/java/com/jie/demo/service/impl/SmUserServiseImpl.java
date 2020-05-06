package com.jie.demo.service.impl;

import com.jie.demo.mapper.SmUserMapper;
import com.jie.demo.model.SmUser;
import com.jie.demo.service.SmUserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SmUserServiseImpl implements SmUserServise {
    @Autowired
    SmUserMapper smUserMapper;

    @Override
    public List<SmUser> getAll() {
        return smUserMapper.selectAll();
    }
}
