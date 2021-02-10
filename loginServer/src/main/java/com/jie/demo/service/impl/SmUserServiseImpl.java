package com.jie.demo.service.impl;

import com.jie.demo.mapper.SmUserMapper;
import com.jie.demo.model.SmUser;
import com.jie.demo.service.SmUserServise;
import org.apache.shiro.crypto.hash.SimpleHash;
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

    @Override
    public SmUser getUserByUserPassword(String username,String password) {
        SmUser userByUserPassword = smUserMapper.getUserByUserPassword(username, new SimpleHash("SHA-1", username, password).toString());
        return userByUserPassword != null? userByUserPassword : null;
    }
}
