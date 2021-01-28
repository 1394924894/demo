package com.jie.test.base;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface MyMapper<T> extends Mapper<T>, InsertListMapper<T> {

}