package com.blog.service;

import com.blog.model.Blog;
import com.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void delete(Long id);

    Page<Blog> findAllByNameOrContent(String name,String content, Pageable pageable);

    Page<Blog> findAllByCategory(Category category, Pageable pageable);
}
