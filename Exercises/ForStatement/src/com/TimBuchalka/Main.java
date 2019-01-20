package com.TimBuchalka;

public class Main {

    public static void main(String[] args) {

        for (int i = 8; i >1; i--){
            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
        }

    }

    public static double calculateInterest(double amaount, double interestRate){

        return (amaount * (interestRate /100));
    }

}
