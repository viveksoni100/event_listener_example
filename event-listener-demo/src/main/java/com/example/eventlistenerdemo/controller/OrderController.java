package com.example.eventlistenerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    @GetMapping("/")
    public ModelAndView iceCreamOrderForm() {
        ModelAndView model = new ModelAndView("order-page");
        model.addObject("orderplaced", Boolean.FALSE);
        return model;
    }

    @PostMapping("/placeorder")
    public ModelAndView placeAnOrder() {
        ModelAndView model = new ModelAndView("order-page");
        model.addObject("orderplaced", Boolean.TRUE);
        return model;
    }

}
