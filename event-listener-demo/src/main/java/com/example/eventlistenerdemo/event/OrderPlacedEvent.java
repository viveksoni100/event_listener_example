package com.example.eventlistenerdemo.event;

import com.example.eventlistenerdemo.service.OrderService;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author viveksoni
 */

@Getter
public class OrderPlacedEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String iceCreamFlavor;

    public OrderPlacedEvent(OrderService orderService, String iceCreamFlavor) {
        super(orderService);
        this.iceCreamFlavor = iceCreamFlavor;
    }
}
