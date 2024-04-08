package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
