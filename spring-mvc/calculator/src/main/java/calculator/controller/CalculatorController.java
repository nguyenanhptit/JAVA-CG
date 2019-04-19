package calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class CalculatorController {

    @RequestMapping(method = RequestMethod.GET, value = "/calculator")
    public String getCal() {
        return "calculator";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/calculator")
    public ModelAndView save(@RequestParam("number1") float number1,@RequestParam("number2") float number2, String operator) {
        ModelAndView mv = new ModelAndView();
        float result;

        if (operator.equals("add")) {
            result = number1 + number2;
            mv.addObject("result", result);
        } else if (operator.equals("sub")) {
            result = number1 - number2;
            mv.addObject("result", result);
        } else if (operator.equals("multi")) {
            result = number1 * number2;
            mv.addObject("result", result);
        } else if (operator.equals("div")) {
            result = number1 / number2;
            mv.addObject("result", result);
        }

        mv.setViewName("calculator");

        return mv;
    }
}
