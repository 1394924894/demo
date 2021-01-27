package com.jie.demo.mapper;

import com.jie.demo.common.druid.MyMapper;
import com.jie.demo.model.TbUser;

import java.util.List;

public interface TbUserMapper extends MyMapper<TbUser> {
    List<TbUser> getUserByUserPassword();
}