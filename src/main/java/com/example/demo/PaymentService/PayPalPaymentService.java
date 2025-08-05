package com.example.demo.PaymentService;


public class PayPalPaymentService implements PaymentService {
    @Override
    public void paymentProcess(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount is: " + amount);
    }
}
