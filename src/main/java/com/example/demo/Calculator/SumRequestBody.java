package com.example.demo.Calculator;


public class SumRequestBody {

    private int digitOne;
    private int digitTwo;


    public int getDigitOne() {
        return digitOne;
    }

    public void setDigitOne(int digitOne) {
        this.digitOne = digitOne;
    }

    public int getDigitTwo() {
        return digitTwo;
    }

    public void setDigitTwo(int digitTwo) {
        this.digitTwo = digitTwo;
    }


    SumRequestBody(){

    }

    SumRequestBody(int digitOne, int digitTwo){
        this.digitOne = digitOne;
        this.digitTwo = digitTwo;
    }


}
