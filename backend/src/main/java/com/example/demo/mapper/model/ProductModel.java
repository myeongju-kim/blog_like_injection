package com.example.demo.mapper.model;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ProductModel {
    private long productId;
    private String productName;
    private String productCode;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private boolean productStatus;
    private long quantity;

    private ProductModel(String productName, String productCode, long quantity) {
        this.productName = productName;
        this.productCode = productCode;
        this.quantity = quantity;
    }

    public static ProductModel insert(String productName, String productCode, long quantity) {
        return new ProductModel(productName, productCode, quantity);
    }
}
