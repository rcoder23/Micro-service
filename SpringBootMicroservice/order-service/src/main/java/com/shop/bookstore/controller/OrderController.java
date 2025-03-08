package com.shop.bookstore.controller;

import com.shop.bookstore.ApplicationProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final RabbitTemplate rabbitTemplate;
    private final ApplicationProperties properties;

    public OrderController(RabbitTemplate rabbitTemplate, ApplicationProperties properties) {
        this.rabbitTemplate = rabbitTemplate;
        this.properties = properties;
    }

//    @PostMapping("/publish")
//    public String publishOrder(@RequestBody String order) {
//        rabbitTemplate.convertAndSend(properties.orderEventsExchange(), properties.newOrdersQueue(), order);
//        return "Order Published!";
//    }
}
