package com.jie.demo.controller;

import com.jie.demo.model.TbUser;
import com.jie.demo.service.TbUserServise;
import com.jie.demo.common.result.RetResponse;
import com.jie.demo.common.result.RetResult;
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
public class TbUserController {
    @Autowired
    private TbUserServise smUserServise;


    @RequestMapping(value = "/time",method  = RequestMethod.POST)
    @ApiOperation(value = "时间",notes = "返回用户信息")
    public RetResult<TbUser> getone() {
        return RetResponse.makeOKRsp(smUserServise.selectByPrimaryKey("7"));
    }

}
