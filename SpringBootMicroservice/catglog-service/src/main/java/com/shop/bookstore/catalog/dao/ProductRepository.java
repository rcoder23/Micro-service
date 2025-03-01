package com.shop.bookstore.catalog.dao;

import com.shop.bookstore.catalog.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
 public interface ProductRepository extends JpaRepository<ProductEntity,Long>{

}
