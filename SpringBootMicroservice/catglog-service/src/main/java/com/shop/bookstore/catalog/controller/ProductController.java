package com.shop.bookstore.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    List<Product> getProduct(@RequestParam(name="page",defaultValue = "1") int pageNo ){
        return productService.getProductst();
    }
}
