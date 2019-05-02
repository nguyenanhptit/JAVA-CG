package com.jdbc.controller;

import com.jdbc.model.Customer;
import com.jdbc.model.Province;
import com.jdbc.service.CustomerService;
import com.jdbc.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/provinces")
    public ModelAndView list() {
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("province/list");
        mv.addObject("provinces", provinces);
        return mv;
    }

    @GetMapping(value = "/create-province")
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("province/create");
        mv.addObject("province", new Province());
        return mv;
    }

    @PostMapping(value = "/create-province")
    public ModelAndView save(@ModelAttribute("province") Province province) {
        provinceService.save(province);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("province/create");
        mv.addObject("province", new Province());
        mv.addObject("message", "create province successful");
        return mv;
    }

    @GetMapping(value = "/edit-province/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        Province province =provinceService.findById(id);
        ModelAndView mv= new ModelAndView();
        if(province != null){
            mv.setViewName("/province/edit");
            mv.addObject("province", province);
            return mv;
        }else {
            mv.setViewName("/error.404");
            return mv;
        }
    }

    @PostMapping(value = "/update-province")
    public ModelAndView update(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView mv= new ModelAndView();
        mv.addObject("province", province);
        mv.setViewName("province/edit");
        mv.addObject("message", "Update successful");
        return mv;
    }

    @GetMapping(value = "/delete-province/{id}")
    public ModelAndView delete(@PathVariable("id") Long id){
        Province province =provinceService.findById(id);
        ModelAndView mv= new ModelAndView();
        if(province != null){
            mv.setViewName("/province/delete");
            mv.addObject("province", province);
            return mv;
        }else {
            mv.setViewName("/error.404");
            return mv;
        }
    }

    @PostMapping(value = "/delete-province")
    public ModelAndView delete(@ModelAttribute("province") Province province){
        provinceService.remove(province.getId());
        ModelAndView mv= new ModelAndView();
        mv.addObject("province", province);
        mv.setViewName("province/delete");
        mv.addObject("message", "delete successful");
        return mv;
    }

    @GetMapping(value = "/view-province/{id}")
    public ModelAndView provinceList(@PathVariable("id") Long id){
        ModelAndView mv= new ModelAndView();
        Province province = provinceService.findById(id);
        if(province == null){
            mv.setViewName("/error.404");
        }

        Iterable<Customer> customers = customerService.findAllByProvince(province);
        mv.setViewName("/province/view");
        mv.addObject("province", province);
        mv.addObject("customer", customers);
        return mv;
    }
}
