package com.valid.user.controller;

import com.valid.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping(value = "/user")
    public ModelAndView form() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("user", new User());
        return mv;
    }

    @PostMapping(value = "/valid-user")
    public ModelAndView checkvalid(@Validated @ModelAttribute("user") User user, BindingResult result) {
        new User().validate(user,result);
        ModelAndView mv = new ModelAndView();
        if (result.hasFieldErrors()) {
            mv.setViewName("home");
            return mv;
        } else {
            mv.setViewName("result");
            mv.addObject("user", user);
            return mv;
        }
    }
}


