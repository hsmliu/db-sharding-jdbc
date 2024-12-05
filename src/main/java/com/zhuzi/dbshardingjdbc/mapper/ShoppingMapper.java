package com.zhuzi.dbshardingjdbc.mapper;

import com.zhuzi.dbshardingjdbc.model.Shopping;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShoppingMapper {
    int deleteByPrimaryKey(Long shopingId);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    Shopping selectByPrimaryKey(Long shopingId);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);

    List<Shopping> getAll();
}