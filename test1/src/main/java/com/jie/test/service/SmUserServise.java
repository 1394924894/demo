package com.jie.test.service;

import com.jie.test.model.SmUser;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface SmUserServise {
    List<SmUser> getAll();
    SmUser getUserByUserPassword(String username,String password);
    String time(Date time);
}
