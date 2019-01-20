import java.time.Year;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes){

        long hour = minutes / 60;
        long day = hour / 24;
        long year = day/365;
        long remainingYear = day % 365;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else
            System.out.println(minutes + " min = " + year +" y and " + remainingYear +" d" );
    }
}
