package com.zhuzi.dbshardingjdbc.model;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
@Component
public class OrderInfo {
    @Id
    private Long orderInfoId;

    private Long orderId;

    private String shoppingName;

    private Integer shoppingPrice;

    public OrderInfo(Long orderInfoId, Long orderId, String shoppingName, Integer shoppingPrice) {
        this.orderInfoId = orderInfoId;
        this.orderId = orderId;
        this.shoppingName = shoppingName;
        this.shoppingPrice = shoppingPrice;
    }

    public OrderInfo() {
        super();
    }

    public Long getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Long orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getShoppingName() {
        return shoppingName;
    }

    public void setShoppingName(String shoppingName) {
        this.shoppingName = shoppingName;
    }

    public Integer getShoppingPrice() {
        return shoppingPrice;
    }

    public void setShoppingPrice(Integer shoppingPrice) {
        this.shoppingPrice = shoppingPrice;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderInfoId=" + orderInfoId +
                ", orderId=" + orderId +
                ", shoppingName='" + shoppingName + '\'' +
                ", shoppingPrice=" + shoppingPrice +
                '}';
    }
}