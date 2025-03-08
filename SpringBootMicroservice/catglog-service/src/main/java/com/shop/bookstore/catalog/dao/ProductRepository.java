package com.shop.bookstore.catalog.dao;

import aj.org.objectweb.asm.commons.Remapper;
import com.shop.bookstore.catalog.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,Long>{

  Optional<ProductEntity> findByCode(String code);
 }
