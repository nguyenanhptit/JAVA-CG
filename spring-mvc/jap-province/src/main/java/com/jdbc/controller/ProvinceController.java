package com.jdbc.controller;

import com.jdbc.model.Province;
import com.jdbc.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping(value = "/provinces")
    public ModelAndView list() {
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("province/list");
        mv.addObject("provinces", provinces);
        return mv;
    }
}
