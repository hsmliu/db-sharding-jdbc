package com.zhuzi.dbshardingjdbc.model;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "shopping")
public class Shopping {
    @Id
    private Long shoppingId;

    private String shoppingName;

    private Integer shoppingPrice;

    public Shopping(Long shoppingId, String shoppingName, Integer shoppingPrice) {
        this.shoppingId = shoppingId;
        this.shoppingName = shoppingName;
        this.shoppingPrice = shoppingPrice;
    }

    public Shopping() {
        super();
    }

    public Long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Long shoppingId) {
        this.shoppingId = shoppingId;
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
        return "shopping{" +
                "shoppingId=" + shoppingId +
                ", shoppingName='" + shoppingName + '\'' +
                ", shoppingPrice=" + shoppingPrice +
                '}';
    }
}