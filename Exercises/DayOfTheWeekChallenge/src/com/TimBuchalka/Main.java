package com.TimBuchalka;

public class Main {

    public static void main(String[] args) {

        printOfTheWeek(8);
        dayOftheWeekChalleng(8);
    }
    public static void printOfTheWeek(int day){

        switch (day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }

    }

    public static void  dayOftheWeekChalleng(int day){

        if( day ==1 )
            System.out.println("Sunday");
        else if( day == 2 )
            System.out.println("Monday");
        else if( day == 3 )
            System.out.println("Tuesday");
        else if( day == 4 )
            System.out.println("Wednesday");
        else if( day ==5 )
            System.out.println("Thursday");
        else if( day == 6 )
            System.out.println("Friday");
        else if( day == 7 )
            System.out.println("Saturday");
        else
            System.out.println("Invalid day");

    }
}
