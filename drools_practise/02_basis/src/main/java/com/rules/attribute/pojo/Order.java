package com.rules.attribute.pojo;

import java.math.BigDecimal;

public class Order {

    /**
     * 订单顾客
     */
    private Customer customer;
    /**
     * 价格
     */
    private BigDecimal price;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
