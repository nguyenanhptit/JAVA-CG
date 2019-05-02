package com.valid.login.controller;

import com.valid.login.model.User;
import com.valid.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/home")
    public ModelAndView home(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("home");
        mv.addObject("user" , new User());
        return mv;
    }

    @PostMapping(value = "/login")
    public  ModelAndView login(@Validated @ModelAttribute("user")User user, BindingResult result){
        ModelAndView mv = new ModelAndView();
        userService.validate(user, result);
        if(result.hasFieldErrors()){
            mv.setViewName("home");
            return mv;
        }else {
            mv.addObject("user", user);
            mv.setViewName("result");
            return mv;

        }
    }
}
