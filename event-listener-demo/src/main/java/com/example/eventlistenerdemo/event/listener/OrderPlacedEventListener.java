package com.example.eventlistenerdemo.event.listener;

import com.example.eventlistenerdemo.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(1)   // sets the order among multiple listener, 1 will execute first
public class OrderPlacedEventListener implements ApplicationListener<OrderPlacedEvent> {

    @Override
    public void onApplicationEvent(OrderPlacedEvent event) {
        log.info("@Order(1) order placed for ice cream : {}", event.getIceCreamFlavor());
    }
}
