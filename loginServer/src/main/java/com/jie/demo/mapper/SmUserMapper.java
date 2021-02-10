package com.jie.demo.mapper;

import com.jie.demo.druid.MyMapper;
import com.jie.demo.model.SmUser;
import org.apache.ibatis.annotations.Param;

public interface SmUserMapper extends MyMapper<SmUser> {
    //@Param(value="username")String username 在此注明之后就不用在 mapper.xml中 写parameterType参数
    SmUser getUserByUserPassword(@Param(value="username")String username, @Param(value="password")String password);
}