package com.shop.bookstore.catalog.controller;

import com.shop.bookstore.catalog.exception.ProductNotFoundException;
import com.shop.bookstore.catalog.model.PagedResult;
import com.shop.bookstore.catalog.model.Product;
import com.shop.bookstore.catalog.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductByCode(@PathVariable String code) {
        log.info("Fetching product for code: {}", code);
        return productService
                .getProductByCode(code)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ProductNotFoundException("Code", HttpStatus.BAD_REQUEST,"Something went wrong!!"));
    }
}
