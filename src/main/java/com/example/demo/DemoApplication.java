package com.example.demo;

import com.example.demo.PaymentService.OrderServiceRequestBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
         SpringApplication.run(DemoApplication.class, args);
//        var orderService = context.getBean(OrderServiceRequestBody.class);
//        orderService.placeOrder();

    }




}
