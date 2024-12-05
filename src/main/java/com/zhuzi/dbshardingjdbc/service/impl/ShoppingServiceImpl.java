package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.mapper.ShoppingMapper;
import com.zhuzi.dbshardingjdbc.model.Shopping;
import com.zhuzi.dbshardingjdbc.service.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {


    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public int deleteByPrimaryKey(Long shoppingId) {
        return shoppingMapper.deleteByPrimaryKey(shoppingId);
    }

    @Override
    public int insert(Shopping record) {
        return shoppingMapper.insert(record);
    }

    @Override
    public int insertSelective(Shopping record) {
        return shoppingMapper.insertSelective(record);
    }

    @Override
    public Shopping selectByPrimaryKey(Long shoppingId) {
        return shoppingMapper.selectByPrimaryKey(shoppingId);
    }

    @Override
    public int updateByPrimaryKeySelective(Shopping record) {
        return shoppingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Shopping record) {
        return shoppingMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Shopping> getAll() {
        return shoppingMapper.getAll();
    }
}
