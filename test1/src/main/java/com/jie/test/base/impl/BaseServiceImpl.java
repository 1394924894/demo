package com.jie.test.base.impl;

import com.jie.demo.common.druid.MyMapper;
import com.jie.test.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 服务层基类实现类
 * 注：自定义需要保存对象日志的操作方法（insert，update，delete操作必须记录日志！）
 */
public abstract class BaseServiceImpl<T, ID, EXAMPLE> implements BaseService<T, ID, EXAMPLE> {


    protected abstract MyMapper<T> getMyMapper();

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(T record) {
        int res = getMyMapper().insert(record);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveSelective(T record) {
        int res = getMyMapper().insertSelective(record);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveList(java.util.List<? extends T> list) {
        int res = getMyMapper().insertList(list);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(T record) {
        int res = getMyMapper().delete(record);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByExample(T record, EXAMPLE example) {
        int res = getMyMapper().deleteByExample(example);

        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(T record, ID key) {
        int res = getMyMapper().deleteByPrimaryKey(key);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByExample(T record, EXAMPLE example) {
        int res = getMyMapper().updateByExample(record, example);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByExampleSelective(T record, EXAMPLE example) {
        int res = getMyMapper().updateByExampleSelective(record, example);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(T record) {
        int res = getMyMapper().updateByPrimaryKey(record);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKeySelective(T record) {
        int res = getMyMapper().updateByPrimaryKeySelective(record);
        return res;
    }
}