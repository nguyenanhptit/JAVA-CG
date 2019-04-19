package email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";


    public EmailController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping(value = "/home")
    public String getEmailRegex() {
        return "home";
    }

    @PostMapping(value = "/validate")
    public String validEmail(@RequestParam("email") String email, Model model) {
        boolean isValid = this.validate(email);
        if (!isValid) {
            model.addAttribute("message", "Email is invalid");
            return "home";
        }
        model.addAttribute("email",email);
        return "success";
    }

    private boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}