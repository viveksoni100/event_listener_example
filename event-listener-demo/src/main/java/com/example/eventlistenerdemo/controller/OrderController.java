package com.example.eventlistenerdemo.controller;

import com.example.eventlistenerdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author viveksoni
 */

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public ModelAndView iceCreamOrderForm() {
        ModelAndView model = new ModelAndView("order-page");
        model.addObject("orderplaced", Boolean.FALSE);
        return model;
    }

    @PostMapping("/placeorder")
    public ModelAndView placeAnOrder(@RequestParam("iceCreamFlavor") String iceCreamFlavor) {
        ModelAndView model = new ModelAndView("order-page");
        orderService.placeOrder(iceCreamFlavor);
        model.addObject("orderplaced", Boolean.TRUE);
        return model;
    }

}
