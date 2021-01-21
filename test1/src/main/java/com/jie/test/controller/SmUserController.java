package com.jie.test.controller;

import com.jie.demo.common.RetResponse;
import com.jie.demo.common.RetResult;
import com.jie.test.model.SmUser;
import com.jie.test.service.SmUserServise;
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
@RestController
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

        return RetResponse.makeOKRsp(smUserServise.getUserByUserPassword(username, password));
    }
    @RequestMapping(value = "/time",method  = RequestMethod.POST)
    @ApiOperation(value = "时间",notes = "返回用户信息")
    public RetResult<SmUser> time(@RequestBody SmUser a) {

        return RetResponse.makeOKRsp(a);
    }

}
