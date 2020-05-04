package com.jie.demo.controller;

import com.jie.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jie.demo.model.Users;

import java.util.List;

@Controller
@RequestMapping("/user")
@Slf4j
@Api(description = "用户controller")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("添加用户")
    @ResponseBody
    @PostMapping("/addUser")
    public Users addUser(Users user) {
        userService.insertSelective(user);
        return user;
    }

    @ApiOperation("按照id获取用户信息")
    @ResponseBody
    @GetMapping("/getUserById")
    public Users getUserById(Integer userId) {
        return userService.selectByPrimaryKey(userId);
    }

    @ApiOperation("查询全部")
    @ResponseBody
    @GetMapping("/getUserAll")
    public List<Users> getUserAll() {

        return null;
    }
}