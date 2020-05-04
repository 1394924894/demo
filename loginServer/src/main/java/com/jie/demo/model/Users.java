package com.jie.demo.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class Users {

    @ApiModelProperty("用户id")
    @ApiParam(hidden = true)
    private Integer userId;

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("用户手机")
    private String userPhone;

    @ApiModelProperty("用户地址")
    private String userAddress;

}
