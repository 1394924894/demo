package com.jie.demo.mapper;


import com.jie.demo.model.Users;
import com.jie.demo.druid.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<Users> {
    int insertSelective(Users var1);
}
