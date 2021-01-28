package com.jie.demo.config;

import tk.mybatis.mapper.entity.Example;

public class MyExample extends Example {
    public MyExample(Class<?> entityClass) {
        super(entityClass);
    }

    public MyExample(Class<?> entityClass, boolean exists) {
        super(entityClass, exists);
    }

    public MyExample(Class<?> entityClass, boolean exists, boolean notNull) {
        super(entityClass, exists, notNull);
    }
}
