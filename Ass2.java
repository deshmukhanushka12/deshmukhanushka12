package com.training;

public class Ass2 {
    public static void main(String[] args) {
        String x="12-08-2003";
        // using split method on string object...it return array of splited characters
        String d=x.split("-")[0];// extract date
        String m=x.split("-")[1];// extract month
        String y=x.split("-")[2];// extract year

        System.out.println("Year : "+y);
    }
}
