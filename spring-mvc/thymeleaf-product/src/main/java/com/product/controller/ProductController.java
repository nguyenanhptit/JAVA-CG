package com.product.controller;

import com.product.model.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

  @GetMapping(value = "/list")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("products", productService.findAll());
        mv.setViewName("list");
        return mv;
    }

    @GetMapping(value = "product/create")
    public ModelAndView create(){
      ModelAndView mv= new ModelAndView();
      mv.addObject("product", new Product());
              mv.setViewName("create");
      return mv;
    }

    @PostMapping(value = "product/save")
    public ModelAndView save(Product product , RedirectAttributes redirect){
      product.setId((int) (Math.random()*100));
      productService.save(product);
      redirect.addFlashAttribute("success", "create success");
      return new ModelAndView("redirect:/list");
    }


    @GetMapping(value = "product/{id}/edit")
    public ModelAndView edit(@PathVariable("id") int id){
        ModelAndView mv= new ModelAndView();
        mv.addObject("product", productService.findById(id));
        mv.setViewName("edit");
        return mv;
    }

    @PostMapping(value = "product/update")
    public ModelAndView update(Product product , RedirectAttributes redirect){

        productService.update(product.getId(),product);
        redirect.addFlashAttribute("success", "update success");
        return new ModelAndView("redirect:/list");
    }

    @GetMapping(value = "product/{id}/delete")
    public ModelAndView delete(@PathVariable("id") int id){
        ModelAndView mv= new ModelAndView();
        mv.addObject("product", productService.findById(id));
        mv.setViewName("delete");
        return mv;
    }

    @PostMapping(value = "product/delete")
    public ModelAndView delete(Product product , RedirectAttributes redirect){

        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "delete success");
        return new ModelAndView("redirect:/list");
    }



}
