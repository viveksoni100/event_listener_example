package com.example.eventlistenerdemo.event;

import com.example.eventlistenerdemo.service.OrderService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class OrderPlacedEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String iceCreamFlavor;

    public OrderPlacedEvent(OrderService orderService, String iceCreamFlavor) {
        super(orderService);
        this.iceCreamFlavor = iceCreamFlavor;
    }
}
