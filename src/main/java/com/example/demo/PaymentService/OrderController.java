package com.example.demo.PaymentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderServiceRequestBody orderServiceRequestBody;

    public OrderController(OrderServiceRequestBody orderServiceRequestBody) {
        this.orderServiceRequestBody = orderServiceRequestBody;
    }

    @GetMapping("/order")
    public String PlaceOrder(){
        orderServiceRequestBody.placeOrder();
        return "Order is placed";
    }
}
