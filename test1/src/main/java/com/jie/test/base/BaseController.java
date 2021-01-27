package com.jie.test.base;

import com.jie.demo.common.result.RetResponse;
import com.jie.demo.common.result.RetResult;
import com.jie.test.model.SmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class BaseController<T> {
    @Autowired
    protected BaseService dao;
    @PostMapping("/getOne")
    public RetResult<List<SmUser>> addUser() {
        return RetResponse.makeOKRsp();
    }
}
