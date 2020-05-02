package springboot_druid_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot_druid_demo.mappers.UserMapper;
import springboot_druid_demo.model.User;
import springboot_druid_demo.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer var1) {
        return userMapper.deleteByPrimaryKey(var1);
    }

    @Override
    public User insertSelective(User var1) {
        userMapper.insertSelective(var1);
        return var1;
    }

    @Override
    public User selectByPrimaryKey(Integer var1) {
        return userMapper.selectByPrimaryKey(var1);
    }

    @Override
    public List<User> getUserAll() {

        return null;
    }
}
