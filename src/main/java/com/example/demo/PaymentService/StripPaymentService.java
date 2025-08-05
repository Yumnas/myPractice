package com.example.demo.PaymentService;

public class StripPaymentService implements PaymentService {
    @Override
    public void paymentProcess(double amount){
        System.out.println("Stripe");
        System.out.println("Amount is: " + amount);
        }
    }

