package com.security.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UserController {
@RequestMapping(value = "/index" , method = RequestMethod.GET)
    public String list(){
    return "index";
}

@RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user (Principal principal){
    ModelAndView mv= new ModelAndView();
    mv.setViewName("user");
    System.out.println(principal.getName());
    return mv;
}

@RequestMapping(value = "/admin" , method = RequestMethod.GET)
    public ModelAndView admin(){
    ModelAndView mv= new ModelAndView();
    SecurityContext context= SecurityContextHolder.getContext();
    System.out.println(context.getAuthentication().getName());
    mv.setViewName("admin");
    return mv;
}
}
