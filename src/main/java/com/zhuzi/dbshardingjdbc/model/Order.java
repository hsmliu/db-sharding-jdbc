package com.zhuzi.dbshardingjdbc.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "order")
public class Order {
    @Id
    private Long orderId;

    private Integer orderPrice;

    private Long userId;

    public Order(Long orderId, Integer orderPrice, Long userId) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.userId = userId;
    }

    public Order() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderPrice=" + orderPrice +
                ", userId=" + userId +
                '}';
    }
}