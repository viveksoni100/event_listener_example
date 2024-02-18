package com.example.eventlistenerdemo.service;

import com.example.eventlistenerdemo.event.OrderPlacedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author viveksoni
 */

@Service
public class OrderService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void placeOrder(String iceCreamFlavor) {
        this.applicationEventPublisher.publishEvent(new OrderPlacedEvent(this, iceCreamFlavor));
    }
}
