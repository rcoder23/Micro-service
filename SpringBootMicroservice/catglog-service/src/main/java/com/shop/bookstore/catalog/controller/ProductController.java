package com.shop.bookstore.catalog.controller;

import com.shop.bookstore.catalog.model.PagedResult;
import com.shop.bookstore.catalog.model.Product;
import com.shop.bookstore.catalog.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    PagedResult<Product> getProduct(@RequestParam(name="page",defaultValue = "1") int pageNo ){
        log.info("Fetching product for page :{}",pageNo);
        return productService.getProducts(pageNo);
    }
}
