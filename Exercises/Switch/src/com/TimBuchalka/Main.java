package com.TimBuchalka;

public class Main {

    public static void main(String[] args) {
	String switchValue = "f";

	switch (switchValue){
        case "a":
            System.out.println("value was a");
            break;
        case "b":
            System.out.println("Value was b");
            break;
        case "c": case  "d": case "e":
            System.out.println("Was c or d or e");
            break;
        default:
            System.out.println("Not found");
            break;
        }


        String month = "June";

	switch (month.toUpperCase()){
        case "JANUARY":
            System.out.println("January");
            break;
        case "JUNE":
            System.out.println("June");
            break;
         default:
             System.out.println("Not sure");
             break;
        }
    }
}
