package com.example.demo.dto;

import com.example.demo.mapper.model.ProductModel;

import java.util.List;

public record ProductsResponse(
        long totalCount,
        List<ProductModel> products
) {
}
