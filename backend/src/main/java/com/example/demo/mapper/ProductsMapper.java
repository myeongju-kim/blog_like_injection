package com.example.demo.mapper;

import com.example.demo.mapper.model.ProductModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductsMapper {
    void insertProduct(ProductModel model);
}
