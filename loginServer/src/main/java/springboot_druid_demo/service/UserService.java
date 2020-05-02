package springboot_druid_demo.service;


import springboot_druid_demo.model.User;

import java.util.List;

public interface UserService {

    int deleteByPrimaryKey(Integer var1);

    User insertSelective(User var1);

    User selectByPrimaryKey(Integer var1);

    List<User> getUserAll();
}
