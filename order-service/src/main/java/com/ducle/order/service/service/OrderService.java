package com.ducle.order.service.service;

import com.ducle.order.service.model.OrderRequest;

public interface OrderService {
    Long placeOrder(OrderRequest orderRequest);
}
