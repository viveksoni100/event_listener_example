package com.example.eventlistenerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    @RequestMapping("/")
    public ModelAndView iceCreamOrderForm() {
        return new ModelAndView("order-page");
    }

}
