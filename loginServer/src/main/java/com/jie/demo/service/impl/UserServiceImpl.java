package com.jie.demo.service.impl;

import com.jie.demo.mapper.UserMapper;
import com.jie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jie.demo.model.Users;


@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users insertSelective(Users var1) {
        userMapper.insertSelective(var1);
        return var1;
    }

    @Override
    public Users selectByPrimaryKey(Integer var1) {
        System.out.println("userMapper.selectAll();"+userMapper.selectByPrimaryKey(var1));
        return userMapper.selectByPrimaryKey(var1);
    }

}
