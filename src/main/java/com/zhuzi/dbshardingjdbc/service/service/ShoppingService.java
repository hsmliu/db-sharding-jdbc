package com.zhuzi.dbshardingjdbc.service.service;

import com.zhuzi.dbshardingjdbc.model.Shopping;

import java.util.List;

public interface ShoppingService {

    int deleteByPrimaryKey(Long shopingId);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    Shopping selectByPrimaryKey(Long shopingId);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);

    List<Shopping> getAll();

}
