package com.example.demo.Calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    //returning a string response
    @PostMapping(value = "/Sum")
    public String getSum(@RequestBody SumRequestBody body){
        int sum = body.getDigitOne() + body.getDigitTwo();
        return "Your sum of digit One and Digit two is " + sum;
    }

    @PostMapping(value = "/Sub")
    public String getSub(@RequestBody SumRequestBody body){
        int sub = body.getDigitOne() - body.getDigitTwo();
        return "Your sub of digit One and Digit two is " + sub;
    }

    @PostMapping(value = "/div")
    public String getDiv(@RequestBody SumRequestBody body){
        float div = (float) body.getDigitOne() / body.getDigitTwo();
        return "Your Div of digit One and Digit two is " + div;
    }

    @PostMapping(value = "/mul")
    public String getMul(@RequestBody SumRequestBody body){
        int  mul = body.getDigitOne() * body.getDigitTwo();
        return "Your multiplication of digit One and Digit two is " + mul;
    }


    // Performs all calculations (sum, sub, mul, div)
    // returns them as a JSON response
    @PostMapping(value = "/calculation")
    public CalculationResponseBody getCalculations(@RequestBody SumRequestBody body){
        int sum = body.getDigitOne() + body.getDigitTwo();
        int sub = body.getDigitOne() - body.getDigitTwo();
        int mul = body.getDigitOne() * body.getDigitTwo();
        int div = body.getDigitOne() / body.getDigitTwo();

        CalculationResponseBody myResponse = new CalculationResponseBody();

        myResponse.setSum(sum);
        myResponse.setSub(sub);
        myResponse.setDiv(div);
        myResponse.setMul(mul);

        return myResponse;
    }
}
