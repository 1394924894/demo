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

import java.util.List;

/**
 *
 * @author jie
 */
@Controller
@RequestMapping("/user")
@Slf4j
@RestController
public class TbUserController {
    @Autowired
    private TbUserServise smUserServise;

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ApiOperation(value = "getAll", notes = "getAll")
    public RetResult<PageInfo<TbUser>> getAll() {

        PageInfo<TbUser> pageInfo = PageHelper.startPage(1,
               3).setOrderBy("id").doSelectPageInfo(() -> smUserServise.selectAll());
        return RetResponse.makeOKRsp(pageInfo);
    }
}
