package com.jie.demo.service.impl;

import com.jie.demo.common.base.impl.BaseServiceImpl;
import com.jie.demo.common.druid.MyMapper;
import com.jie.demo.mapper.TbUserMapper;
import com.jie.demo.model.TbUser;
import com.jie.demo.service.TbUserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TbUserServiseImpl extends BaseServiceImpl<TbUser, Integer, Object> implements TbUserServise {
    @Autowired
    TbUserMapper tbUserMapper;

    /**
     *  重写 BaseServiceImpl 抽象方法，将当前 smUserMapper 返回
      */
    @Override
    protected MyMapper<TbUser> getMyMapper() {
        return tbUserMapper;
    }

    @Override
    public List<TbUser> getUserByUserPassword() {
        return tbUserMapper.getUserByUserPassword();
    }
}
