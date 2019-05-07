package com.blog.service;

import com.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    Category findById(Long id);

    void save(Category category);

    void delete(Long id);

    Page<Category> findByName(String name ,Pageable  pageable);
}
