package com.blog.repository;

import com.blog.model.Blog;
import com.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
Page<Blog> findAllByNameContainingOrContentContaining (String name,String content ,Pageable pageable);
Page<Blog> findAllByCategory(Category category, Pageable pageable);
}
