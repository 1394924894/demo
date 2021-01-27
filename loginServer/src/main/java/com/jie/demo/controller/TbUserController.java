package com.jie.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jie.demo.common.result.RetResponse;
import com.jie.demo.common.result.RetResult;
import com.jie.demo.model.TbUser;
import com.jie.demo.service.TbUserServise;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Controller
@RequestMapping("/user")
@Slf4j
@RestController
@Api(description = "smUser")
public class TbUserController {
    @Autowired
    private TbUserServise smUserServise;


    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ApiOperation(value = "getAll", notes = "getAll")
    public RetResult<PageInfo<TbUser>> getAll() {
        List<TbUser> list = smUserServise.selectAll();
        //设置PageHelper分页信息，1表示当前第1页，10表示当前页的条数为10
        PageHelper.startPage(1, 1);
        //获取分页信息
        PageInfo<TbUser> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);
        return RetResponse.makeOKRsp(pageInfo);
    }
    @RequestMapping(value = "/time", method = RequestMethod.POST)
    @ApiOperation(value = "时间", notes = "返回用户信息")
    public RetResult<TbUser> getone() {
        return RetResponse.makeOKRsp(smUserServise.selectByPrimaryKey("7"));
    }


    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @ApiOperation(value = "all", notes = "all")
    public RetResult<List<TbUser>> all() {
        return RetResponse.makeOKRsp(smUserServise.getUserByUserPassword());
    }
}
