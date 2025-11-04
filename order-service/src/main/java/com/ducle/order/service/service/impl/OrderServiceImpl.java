package com.ducle.order.service.service.impl;

import com.ducle.order.service.entity.Order;
import com.ducle.order.service.model.OrderRequest;
import com.ducle.order.service.repository.OrderRepository;
import com.ducle.order.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long placeOrder(OrderRequest orderRequest) {

        // 1. save the order details to the database and status as CREATED
        // 2. call the product service to reduce the inventory
        // 3. call the payment service to make the payment if success update the order status to PLACED
        // 4. if payment fails update the order status to PAYMENT_FAILED

        // Step 1: Save order details to the database with status as CREATED
        Order order = new Order();
        order.setAmount(orderRequest.getAmount());
        order.setProductId(orderRequest.getProductId());
        order.setQuantity(orderRequest.getQuantity());
        order.setOrderDate(Instant.now());
        order.setOrderStatus("CREATED");

        order = orderRepository.save(order);
        return order.getOrderId();
    }
}
