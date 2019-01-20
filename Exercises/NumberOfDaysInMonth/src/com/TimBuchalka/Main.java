package com.TimBuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println( isLeapYear(2020));
        System.out.println(getDaysInMonth(2,1900));

    }
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                return true;
            else
                return false;
        }

        else
            return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        int days = 0;

        switch (month){
            case 1:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year))
                    days = 29;
                else
                    days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                  System.out.println("ERROR");
        }

        return days;

    }
}
