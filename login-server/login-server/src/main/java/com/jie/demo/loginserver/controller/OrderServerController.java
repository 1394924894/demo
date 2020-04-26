package com.jie.demo.loginserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ResponseMessage;

/**
 *
 * @Description:
 * @Date：Created on 2018/3/15 18:14.
 */
@RestController
@Api(tags = "OrderServerController", description = "登录系统api")
public class OrderServerController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/orderSomething/{name}")
    @ApiOperation(value = "登录系统api")
    public ResponseMessage order(@PathVariable String name) {
        String resule = "第"+name+"次请求,服务的端口为:" +port;
        return new ResponseMessageBuilder().code(200).message("OrderService1-下单成功"+resule).build();
    }
    
    @RequestMapping("/testVoid")
    @ApiOperation(value = "测试不返回信息的")
    public void test(){
    	try {
			throw new Exception("测试不返回信息的服务");
		} catch (Exception e) {
			e.printStackTrace();
		}
//        new Throwable("测试不返回信息的服务");
    }
}
