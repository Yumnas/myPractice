package com.example.demo.PaymentService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${spring.sada.paymentGateway}")
    private String paymentGateway;

    @Bean
    public PaymentService sada() {
        return new SadaPayService();
    }

    @Bean
    public PaymentService stripe() {
        return new StripPaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderServiceRequestBody orderService() {
        if(paymentGateway.equals("sada")) {
            return new OrderServiceRequestBody(sada());
        } else if(paymentGateway.equals("stripe")){
            return new OrderServiceRequestBody(stripe());
        }
        return new OrderServiceRequestBody(paypal());
    }
}


