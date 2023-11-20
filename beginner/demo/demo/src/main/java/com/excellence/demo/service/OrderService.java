package com.excellence.demo.service;

import com.excellence.demo.model.ExampleOrder;
import com.excellence.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public List<ExampleOrder> getAllOrder() {
        List<ExampleOrder> orders = orderRepository.getAllOrder();
        return orders;
    }

    public OrderService(OrderRepository orderRepository) {//コンストラクタ
        this.orderRepository = orderRepository;
    }
}