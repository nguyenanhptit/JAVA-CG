package com.customer.controller;

import com.customer.model.Customer;
import com.customer.service.CustomerService;
import com.customer.service.CustomerServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("customers", customerService.findAll());
        mv.setViewName("home");
        return mv;
    }

    @GetMapping(value = "/customer/create")
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("customer", new Customer());
        mv.setViewName("create");
        return mv;
    }

    @PostMapping(value = "/customer/save")
    public ModelAndView save(Customer customer, RedirectAttributes rd) {
        ModelAndView mv = new ModelAndView();
        customer.setId((int) (Math.random() * 1000));
        customerService.save(customer);
        rd.addFlashAttribute("success", "Saved customer successfully!");
        return new ModelAndView("redirect:/home");
    }

    @GetMapping(value = "/customer/{id}/edit")
    public ModelAndView edit(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("customer", customerService.findById(id));
        mv.setViewName("edit");
        return mv;
    }

    @PostMapping(value = "/customer/update")
    public ModelAndView update(Customer customer, RedirectAttributes rd) {
        customerService.update(customer.getId(), customer);
        rd.addFlashAttribute("success", "Update customer successfully");
        return new ModelAndView("redirect:/home");
    }

    @GetMapping(value = "/customer/{id}/delete")
    public ModelAndView delete(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("delete");
        mv.addObject("customer", customerService.findById(id));
        return mv;
    }

    @PostMapping(value = "/customer/delete")
    public ModelAndView delete(Customer customer, RedirectAttributes rd) {
        customerService.remove(customer.getId());
        rd.addFlashAttribute("success", "Removed customer successfull");
        return new ModelAndView("redirect:/home");
    }

}
