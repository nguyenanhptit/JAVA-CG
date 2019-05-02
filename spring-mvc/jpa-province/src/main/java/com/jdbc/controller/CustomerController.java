package com.jdbc.controller;

import com.jdbc.model.Customer;
import com.jdbc.model.Province;
import com.jdbc.service.CustomerService;
import com.jdbc.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping(value = "/customers")
    public ModelAndView list(@RequestParam("search") Optional<String> search ,Pageable pageable) {
        Page<Customer> customers;
        if(search.isPresent()){
            customers= customerService.findAllByFirstName(search.get(),pageable);
        }else {
           customers= customerService.findAll(pageable);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/customer/list");
        mv.addObject("customers", customers);
        return mv;
    }

    @RequestMapping(value = "/create-customer", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/customer/create");
        mv.addObject("customer", new Customer());
        return mv;
    }

    @RequestMapping(value = "/create-customer", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/customer/create");
        mv.addObject("customer", new Customer());
        mv.addObject("message", "create successful!!!");
        return mv;
    }



    @GetMapping(value = "/edit-customer/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView mv = new ModelAndView();
        if (customer != null) {
            mv.setViewName("/customer/edit");
            mv.addObject("customer", customer);
            return mv;
        } else {
            mv.setViewName("/error.404");
            return mv;
        }
    }

    @PostMapping(value = "/update-customer")
    public ModelAndView update(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/customer/edit");
        mv.addObject("customer", customer);
        mv.addObject("message", "update successful");
        return mv;
    }

    @GetMapping(value = "/delete-customer/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView mv = new ModelAndView();
        if (customer != null) {
            mv.setViewName("/customer/delete");
            mv.addObject("customer", customer);
            return mv;
        } else {
            mv.setViewName("/error.404");
            return mv;
        }
    }

    @PostMapping(value = "/delete-customer")
    public ModelAndView delete(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/customers");
        return mv;
    }
}
