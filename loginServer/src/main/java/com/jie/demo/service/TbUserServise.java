package com.jie.demo.service;

import com.jie.demo.common.base.BaseService;
import com.jie.demo.model.TbUser;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface TbUserServise extends BaseService<TbUser, Integer, Object>{
    List<TbUser> getUserByUserPassword();
}
