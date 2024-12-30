package com.Intern_Assignment.e_commerce.system.Part03_Placing_Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody OrderRequest orderRequest) {
        Order order = new Order();
        order.setCustomerName(orderRequest.getCustomerName());
        Order createdOrder = orderService.placeOrder(order, orderRequest.getItemIds(), orderRequest.getQuantities(), orderRequest.getDiscountCode());
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
}
