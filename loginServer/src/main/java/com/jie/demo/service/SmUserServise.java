package com.jie.demo.service;

import com.jie.demo.model.SmUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SmUserServise {
    List<SmUser> getAll();
    SmUser getUserByUserPassword(String username,String password);
}
