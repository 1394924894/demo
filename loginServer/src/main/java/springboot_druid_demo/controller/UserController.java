package springboot_druid_demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot_druid_demo.model.User;
import springboot_druid_demo.service.UserService;

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
    public User addUser(User user) {

        userService.insertSelective(user);
        return user;
    }

    @ApiOperation("按照id获取用户信息")
    @ResponseBody
    @GetMapping("/getUserById")
    public User getUserById(Integer userId) {
        return userService.selectByPrimaryKey(userId);
    }
    @ApiOperation("查询全部")
    @ResponseBody
    @GetMapping("/getUserAll")
    public List<User> getUserAll() {

        return userService.getUserAll();
    }
}