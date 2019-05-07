package com.blog.service.impl;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.repository.BlogRepository;
import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }


    @Override
    public void delete(Long id) {
        blogRepository.delete(id);
    }

    @Override
    public Page<Blog> findAllByNameOrContent(String name, String content, Pageable pageable) {
        return blogRepository.findAllByNameContainingOrContentContaining(name, content, pageable);
    }


    @Override
    public Page<Blog> findAllByCategory(Category category , Pageable pageable) {
        return blogRepository.findAllByCategory(category,pageable);
    }


}
