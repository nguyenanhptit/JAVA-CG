package com.security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
private String getPrincipal(){
    String userName = null;
    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    if(principal instanceof UserDetails){
        userName = ((UserDetails) principal).getUsername();
    }else {
        userName = principal.toString();
    }
    return userName;
}

@GetMapping(value = {"/", "/home"})
    public ModelAndView page(){
    ModelAndView mv = new ModelAndView();
    mv.addObject("user",getPrincipal());
    mv.setViewName("welcome");
    return mv;
}
}
