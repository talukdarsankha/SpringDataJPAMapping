package com.xyz.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
