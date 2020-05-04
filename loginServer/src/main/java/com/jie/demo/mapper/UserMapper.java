package com.jie.demo.mapper;


import com.jie.demo.model.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer var1);

    int insertSelective(Users var1);

    Users selectByPrimaryKey(Integer var1);

}
