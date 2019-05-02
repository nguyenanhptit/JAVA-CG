package com.cookie.controller;

import com.cookie.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {

    @ModelAttribute("user") // lưu trữ thông tin của model attribute có tên là user.
    //Đoạn mã sau đây sẽ add User vào trong model attribute:
    public User setUpUserForm() {
        return new User();
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(@CookieValue(value = "setUser", defaultValue = "") String setUser) {
        ModelAndView mv = new ModelAndView();
        Cookie cookie = new Cookie("setUser", setUser);
        mv.addObject("cookieValue", cookie);
        mv.setViewName("login");
        return mv;
    }

    @PostMapping(value = "/logined")//@ModelAttribute("user") sẽ nhận user trả về từ view, sau đó đưa vào session:
    public ModelAndView doLogin(@ModelAttribute("user") User user, @CookieValue(value =
            "setUser", defaultValue = "") String setUser, HttpServletRequest rq, HttpServletResponse resp) {
        ModelAndView mv = new ModelAndView();
        if (user.getEmail().equals("nguyenanh") && user.getPassword().equals("a")) {
            if (user.getEmail() != null) {
                setUser = user.getEmail();
            }
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(24 * 60 * 60);
            resp.addCookie(cookie);

            Cookie[] cookies = rq.getCookies();

            for (Cookie c : cookies) {
                if (c.getName().equals("setUser")) {
                    mv.addObject("cookieValue", c);
                    break;
                } else {
                    c.setValue("");
                    mv.addObject("cookieValue", c);
                    break;
                }
            }
            mv.addObject("message","login success !!!");
        }else {
            user.setEmail("");
            Cookie cookie = new Cookie("setUser", setUser);
            mv.addObject("cookieValue", cookie);
            mv.addObject("message", "login failed !!");
        }
        mv.setViewName("login");
        return mv;
    }
}
