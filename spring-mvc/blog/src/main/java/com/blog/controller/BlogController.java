package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.BlogService;
import com.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Page<Category> category(Pageable pageable){
        return categoryService.findAll(pageable);
    }



    @RequestMapping(method = RequestMethod.GET, value = "/blogs")
    public ModelAndView list(@RequestParam("search") Optional<String> search, @PageableDefault(value = 5) Pageable pageable) {
        Page<Blog> blogs;
        if (search.isPresent()) {
            blogs = blogService.findAllByNameOrContent(search.get(),search.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog/list");
        mv.addObject("blogs", blogs);
        return mv;
    }

    @RequestMapping(value = "create-blog", method = RequestMethod.GET)
    public ModelAndView create( ) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog/create");
        mv.addObject("blog",new Blog());
        return mv;
    }

    @RequestMapping(value = "create-blog", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("blog") Blog blog) {
        ModelAndView mv = new ModelAndView();
        blogService.save(blog);
        mv.setViewName("blog/create");
        mv.addObject("blog", new Blog());
        mv.addObject("message", "create successful!!");
        return mv;
    }

    @RequestMapping(value = "/edit-blog/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView();
        Blog blog = blogService.findById(id);
        if (blog != null) {
            mv.setViewName("blog/edit");
            mv.addObject("blog", blog);
            return mv;
        } else {
            mv.setViewName("error-404");
            return mv;
        }
    }

    @RequestMapping(value = "/update-blog", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("blog") Blog blog) {
        ModelAndView mv = new ModelAndView();
        blogService.save(blog);
        mv.setViewName("blog/edit");
        mv.addObject("blog", blog);
        mv.addObject("message", "update successful!!!");
        return mv;
    }

    @RequestMapping(value = "delete-blog/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView();
        Blog blog = blogService.findById(id);
        if (blog != null) {
            mv.setViewName("blog/delete");
            mv.addObject("blog", blog);

        } else {
            mv.setViewName("error-404");
        }
        return mv;
    }

    @RequestMapping(value = "delete-blog", method = RequestMethod.POST)
    public ModelAndView delete(@ModelAttribute("blog") Blog blog) {
        ModelAndView mv = new ModelAndView();
        blogService.delete(blog.getId());
        mv.addObject("message", "Delete successful!!!");
        mv.setViewName("blog/delete");
        return mv;
    }
}
