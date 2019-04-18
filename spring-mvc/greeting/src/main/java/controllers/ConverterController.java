package controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ConverterController extends HttpServlet{
    @RequestMapping(method = RequestMethod.POST, value = "/converter")

    public String convert ( float rate , float usd , Model model){
        float vnd = rate*usd;

       model.addAttribute("vnd", vnd);
        return "converter";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/converter")
    public String converted(){
        return "converter";
    }

}
