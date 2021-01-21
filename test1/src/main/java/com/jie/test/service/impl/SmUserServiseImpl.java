package com.jie.test.service.impl;

import com.jie.test.mapper.SmUserMapper;
import com.jie.test.model.SmUser;
import com.jie.test.service.SmUserServise;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
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

    @Override
    public String time(Date time){

        return time.toString();
    }
}
