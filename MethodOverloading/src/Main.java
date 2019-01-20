public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(8,4);

        calcFeetAndInchesToCentimeters(-10);


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid input!!!!!!!!!");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters+= inches * 2.54;
        System.out.println("Feet: " + feet + " Inches: " + inches + " Centimeters: " + centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0) {
            System.out.println("Invalid input!");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println("Inches are equals to " + feet + " Feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

}
