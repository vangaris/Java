public class Main {
    private static final double PI = 3.14159;

    public static void main(String[] args) {

        System.out.println(area(2));
        System.out.println(area(2,2));
    }

    public static double area ( double radius){
        if (radius < 0){
            return -1;
        }

        double circleArea = radius * radius + PI;
        return circleArea;
    }

    public static double area ( double x, double y){

        if (x < 0 || y < 0)
            return -1;

        double area = x*y;

        return area;
    }


}

