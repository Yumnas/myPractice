package com.example.demo.PaymentService;


public class SadaPayService implements PaymentService {
    @Override
    public void paymentProcess(double amount){
        System.out.println("SadaPay");
        System.out.println("Amount is " + amount);
    }

}
