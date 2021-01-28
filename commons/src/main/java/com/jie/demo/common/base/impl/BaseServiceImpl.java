package com.jie.demo.common.base.impl;

import com.jie.demo.common.base.BaseService;
import com.jie.demo.common.druid.MyMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 服务层基类实现类
 */
public abstract class BaseServiceImpl<T, ID, EXAMPLE> implements BaseService<T, ID, EXAMPLE> {

    // 定义抽象方法getMyMapper获取当前实体Mapper对象
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
    @Override
    @Transactional(rollbackFor = Exception.class)
    public T selectByPrimaryKey(String key){
        return getMyMapper().selectByPrimaryKey(key);
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<T> selectAll(){
        return getMyMapper().selectAll();
    }
}