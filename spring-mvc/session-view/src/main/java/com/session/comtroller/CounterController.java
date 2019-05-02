package com.session.comtroller;

import com.session.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("counter")
public class CounterController {
    @ModelAttribute("counter")
    public Counter setUpCounter(){
        return new Counter();
    }

    @GetMapping("/home")
    public ModelAndView home (@ModelAttribute("counter") Counter counter){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("home");
        counter.increment();
        return mv;
    }
}
