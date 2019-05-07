package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.BlogService;
import com.blog.service.CategoryService;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BlogService blogService;
    @RequestMapping("/view-category/{id}")
    public ModelAndView listCategory(@PathVariable("id")Long id, @PageableDefault(value = 5) Pageable pageable){
        ModelAndView mv = new ModelAndView();
        Category category = categoryService.findById(id);
        if (category == null){
            mv.setViewName("error-404");
        }else {
            Page<Blog> blogs = blogService.findAllByCategory(category,pageable);
            mv.setViewName("category/view");
            mv.addObject("blogs",blogs );
            mv.addObject("category", category);

        }
        return mv;

    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam("search") Optional<String> search, @PageableDefault(value = 5)  Pageable pageable) {
        ModelAndView mv = new ModelAndView();
        Page<Category> categories;
        if (search.isPresent()) {
            categories = categoryService.findByName(search.get(), pageable);
        } else {
            categories = categoryService.findAll(pageable);
        }
        mv.setViewName("category/list");
        mv.addObject("categories", categories);
        return mv;
    }

    @RequestMapping(value = "/create-category", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("category", new Category());
        mv.setViewName("category/create");
        return mv;
    }

    @RequestMapping(value = "/create-category", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("category") Category category) {
        ModelAndView mv = new ModelAndView();
        categoryService.save(category);
        mv.setViewName("category/create");
        mv.addObject("message", "Create successful !!!");
        mv.addObject("category", new Category());
        return mv;
    }

    @RequestMapping(value = "/edit-category/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView();
        Category category = categoryService.findById(id);
        if (category == null) {
            mv.setViewName("error-404");
            return mv;
        } else {
            mv.setViewName("category/edit");
            mv.addObject("category", category);
            return mv;
        }

    }

    @RequestMapping(value = "/update-category", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("category") Category category){
        ModelAndView mv= new ModelAndView();
        categoryService.save(category);
        mv.setViewName("category/edit");
        mv.addObject("category", category);
        mv.addObject("message", "Update successful !!!");
        return mv;
    }

    @RequestMapping(value = "/delete-category/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView();
        Category category = categoryService.findById(id);
        if(category == null){
            mv.setViewName("error-404");
        }else {
            mv.setViewName("category/delete");
            mv.addObject("category", category);
        }
        return mv;
    }

    @RequestMapping(value = "delete-category", method = RequestMethod.POST)
    public ModelAndView delete(Category category){
        ModelAndView mv= new ModelAndView();
        categoryService.delete(category.getId());
        mv.setViewName("redirect:/categories");
        mv.addObject("category", category);
        return mv;
    }
}
