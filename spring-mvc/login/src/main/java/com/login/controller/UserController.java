package com.login.controller;

import com.login.dao.UserDao;
import com.login.model.Login;
import com.login.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;

@Controller

public class UserController {

    @GetMapping(value = "/home")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("login", new Login());
        return mv;
    }

    @PostMapping(value = "/login")
    public ModelAndView login( Login login){
        ModelAndView mv = new ModelAndView();
        User user = UserDao.checkLogin(login);
        if(user ==null){
            mv.setViewName("error");
            return mv;
        }else {
            mv.setViewName("user");
            mv.addObject("users",user);
            return mv;
        }
    }


}
