package com.example.eventlistenerdemo.event.listener;

import com.example.eventlistenerdemo.event.OrderPlacedEvent;
import com.example.eventlistenerdemo.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author viveksoni
 */

@Slf4j
@Component
@Order(1)   // sets the order among multiple listener, 1 will execute first
public class OrderPlacedEventListener implements ApplicationListener<OrderPlacedEvent> {

    @Autowired
    private EmailService emailService;

    @Override
    public void onApplicationEvent(OrderPlacedEvent event) {
        log.info("@Order(1) order placed for ice cream : {}", event.getIceCreamFlavor());
        log.info("sending an email ::: ");
        emailService.sendSimpleMessage("recipient@yopmail.com", "Order Placed", "we've successfully placed your ice cream ::: " +  event.getIceCreamFlavor());
        log.info("an email sent ::: ");
    }
}
