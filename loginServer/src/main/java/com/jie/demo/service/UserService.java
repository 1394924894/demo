package com.jie.demo.service;

import com.jie.demo.model.Users;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    Users insertSelective(Users var1);

    Users selectByPrimaryKey(Integer var1);

}
