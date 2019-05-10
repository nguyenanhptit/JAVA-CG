package com.note.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
     @RequestMapping(value = "/layout" , method = RequestMethod.GET)
    public ModelAndView layout(){
         ModelAndView mv = new ModelAndView();
         mv.setViewName("layout");
         return mv;
     }

    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dashboard/index");
        return mv;
    }
}
