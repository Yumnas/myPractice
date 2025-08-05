package com.example.demo.PaymentService;

public class OrderServiceRequestBody {
    private final PaymentService paymentService;

   public OrderServiceRequestBody(PaymentService paymentService){
        this.paymentService =  paymentService;
    }
    public void placeOrder(){
        paymentService.paymentProcess(300);
    }

}
