package com.google;
/*
Author : Anushka
code for convert percentage to fraction
* */

public class Ass4 {
    public static void main(String[] args) {
        int per=30; //percentage = 30%
        // To convert percentage into fraction simply remove % sign and divide that by 100
        // we can reduce fraction further
        int numerator=per;
        int denominator=100;
        // fraction = numerator / denominator
        System.out.println(" Fraction of "+ per+" % is: "+numerator+"/"+denominator);
        // to reuduce we can divide nume and denom by 10 ..both are divisible by 10..
        numerator=per/10;
        denominator=100/10;
        System.out.println(" Fraction of "+ per+" % is: "+numerator+"/"+denominator);


    }
}
