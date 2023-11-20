package com.excellence.demo.controller.order;

import com.excellence.demo.controller.order.request.ExampleOrderRequest;
import com.excellence.demo.controller.order.response.OrdersResponse;
import com.excellence.demo.model.ExampleOrder;
import com.excellence.demo.model.ValidateResult;
import com.excellence.demo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public OrdersResponse getAll() {
        List<ExampleOrder> orders = service.getAllOrder();
        OrdersResponse response = new OrdersResponse(orders);
        return response;
    }

    /*
     *  @RequestBodyは、クライアントからのリクエストボディを
     *  指定したクラスにマッピングできる(今回は、ExampleOrderRequestクラスにマッピング)。
     *  その後、リクエストが有効であるかどうかを検証し、
     *  有効でない場合は、ステータスコード400とカスタムメッセージでエラー結果を返す
     */
    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ExampleOrderRequest request) {
        ValidateResult validate = request.validate();
        if (!validate.ok()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, validate.errorMessage());
        }
        service.createOrder(request.toExampleOrder());
    }

    public OrderController(OrderService service) {
        this.service = service;
    }
}