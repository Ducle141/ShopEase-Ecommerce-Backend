package com.ducle.product.service.service;

import com.ducle.product.service.model.ProductRequest;
import com.ducle.product.service.model.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse addProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
    ProductResponse getProductById(Long productId);


    // most important
    void reduceQuantity(Long productId, Long quantity);
}
