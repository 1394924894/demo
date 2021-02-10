package com.jie.demo.controller;

import com.jie.demo.model.SmUser;
import com.jie.demo.service.SmUserServise;
import com.jie.demo.common.RetResponse;
import com.jie.demo.common.RetResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@Slf4j
@Api(description = "smUser")
public class SmUserController {
    @Autowired
    private SmUserServise smUserServise;

    @ApiOperation("获取全部")
    @ResponseBody
    @PostMapping("/getAll")
    public RetResult<List<SmUser>> addUser() {
        return RetResponse.makeOKRsp(smUserServise.getAll());
    }
    @ApiOperation(value = "登录",notes = "返回用户信息")
    @ResponseBody
    @PostMapping("/login")
    public RetResult<SmUser> login(@RequestParam String username, @RequestParam String password) {
        System.out.println( );
        return RetResponse.makeOKRsp(smUserServise.getUserByUserPassword(username, password));
    }
}
