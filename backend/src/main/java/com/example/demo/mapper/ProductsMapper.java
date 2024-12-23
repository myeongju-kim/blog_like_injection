package com.example.demo.mapper;

import com.example.demo.mapper.model.ProductModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductsMapper {
    List<ProductModel> getProductsByProductName(String productName);
    void insertProduct(ProductModel model);
}
