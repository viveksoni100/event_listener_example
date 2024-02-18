package com.example.eventlistenerdemo.event.listener;

import com.example.eventlistenerdemo.event.OrderPlacedEvent;
import com.example.eventlistenerdemo.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author viveksoni
 */

@Slf4j
@Component
public class OrderPlacedEventListenerAnnotation {

    @Autowired
    private EmailService emailService;

    @EventListener
    @Order(2)
    public void handleEvent(OrderPlacedEvent event) {
        log.info("@Order(2) order placed for ice cream using @EventListener : {}", event.getIceCreamFlavor());
        log.info("sending an email ::: ");
        emailService.sendSimpleMessage("recipient@yopmail.com", "Order Placed", "we've successfully placed your ice cream ::: " +  event.getIceCreamFlavor());
        log.info("an email sent ::: ");
    }

}
