package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class GreetingController  {
    @RequestMapping(method = GET, value = "/greeting")
        public String greeting(@RequestParam String name, Model model){
        name = "nguyenanh";
        model.addAttribute("name",name);
        return "greeting";
        }
}
