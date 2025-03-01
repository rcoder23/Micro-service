package com.shop.bookstore.catalog.mapper;

import com.shop.bookstore.catalog.model.Product;
import com.shop.bookstore.catalog.model.ProductEntity;

public class ProductMapper {
    public static Product toProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice());
    }
}
