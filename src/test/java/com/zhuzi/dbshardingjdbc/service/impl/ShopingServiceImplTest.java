package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.DbShardingJdbcApplicationTests;
import com.zhuzi.dbshardingjdbc.model.Shopping;
import com.zhuzi.dbshardingjdbc.service.service.ShoppingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class ShopingServiceImplTest extends DbShardingJdbcApplicationTests {

    @Autowired
    private ShoppingService shopingService;

    /**
     * 测试数据节点是否可用
     * **/
    @Test
    void insertSelective() {
        Shopping shoping = new Shopping();
        shoping.setShoppingId(11111112L);
        shoping.setShoppingName("黄金零号竹子");
        shoping.setShoppingPrice(8888);
        shopingService.insertSelective(shoping);
    }

    /**
     * 测试分库策略是否有效
     * **/
    @Test
    void databaseStrategyInsert() {
        for (int i = 1; i <= 10; i++){
            Shopping shoping = new Shopping();
            shoping.setShoppingId((long) i);
            shoping.setShoppingName("黄金"+ i +"号竹子");
            shoping.setShoppingPrice(1111 * i);
            shopingService.insertSelective(shoping);
        }
    }

    /**
     * 测试按商品名称的分表策略是否有效
     * **/
    @Test
    void tableStrategyInsert() {
        for (int i = 1; i <= 20; i++){
            Shopping shoping =
                    new Shopping((long) i, "白玉"+ i +"号竹子", i * 888);
            shopingService.insertSelective(shoping);
        }
    }

    /**
     * 根据商品ID查询单条数据
     * **/
    @Test
    void findByShopingID() {
        Shopping shoping = shopingService.selectByPrimaryKey(1L);
        System.out.println(shoping);
    }

    /**
     * 查询所有商品数据
     * **/
    @Test
    void queryAllShopingData() {
        List<Shopping> shopings = shopingService.getAll();
        shopings.forEach(System.out::println);
    }

    /**
     * 测试分布式序列算法 - 雪花算法的效果
     * **/
    @Test
    void insertSnowflake() {
        for (int i = 1; i <= 10; i++) {
            Shopping shoping = new Shopping();
            shoping.setShoppingName("黄金"+ i +"号竹子");
            shoping.setShoppingPrice(8888);
            shopingService.insertSelective(shoping);
        }
    }

}