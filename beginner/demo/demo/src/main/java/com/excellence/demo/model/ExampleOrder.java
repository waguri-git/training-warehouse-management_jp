package com.excellence.demo.model;

import java.time.LocalDate;

public class ExampleOrder {
    public final int id;
    public final int itemId;
    public final String name;
    public final int amount;
    public final OrderStatus orderStatus;
    public final LocalDate orderDate;

    public ExampleOrder(int id, int itemId, String name,int amount, OrderStatus orderStatus, LocalDate orderDate) {
        this.id = id;
        this.itemId = itemId;
        this.name = name;
        this.amount = amount;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
    }
}
