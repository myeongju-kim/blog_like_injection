package com.example.demo.controller;

import com.example.demo.dto.ProductsResponse;
import com.example.demo.service.ProductsService;
import com.example.demo.utils.annotations.Log;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductsService productsService;

    @Log
    @GetMapping
    public ResponseEntity<ProductsResponse> getProducts(@RequestParam String productName){
        return ResponseEntity.ok(productsService.getProducts(productName));
    }
}
