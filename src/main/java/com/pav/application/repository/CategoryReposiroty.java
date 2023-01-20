package com.pav.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pav.application.entity.Category;

public interface CategoryReposiroty extends JpaRepository<Category, Integer> {

}
