package com.example.demo.service;

import com.example.demo.dto.ProductsResponse;
import com.example.demo.mapper.ProductsMapper;
import com.example.demo.mapper.model.ProductModel;
import com.example.demo.utils.SqlEscapeUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductsMapper productsMapper;

    public ProductsResponse getProducts(String productName){
        List<ProductModel> products = productsMapper.getProductsByProductName(SqlEscapeUtil.escape(productName));
        return new ProductsResponse(products.size(), products);
    }
}
