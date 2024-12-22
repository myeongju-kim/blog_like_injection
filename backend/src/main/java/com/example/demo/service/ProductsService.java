package com.example.demo.service;

import com.example.demo.mapper.ProductsMapper;
import com.example.demo.mapper.model.ProductModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductsMapper productsMapper;

    public void insertTest() {
        Random random = new Random();
        for (int i = 1; i <= 3000; i++) {
            ProductModel model = ProductModel.insert("킹명주 테스트상품" + i, "SW-" + i, random.nextInt(100) + 1);
            productsMapper.insertProduct(model);
        }
    }
}
