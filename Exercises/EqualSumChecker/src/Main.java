public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(-2,1,3));
        System.out.println(hasTeen(14,1,2));

    }

    public static boolean hasEqualSum(int a, int b, int c){
        if (a + b == c)
            return true;
        else
            return false;
    }

    //hasTeen

    public static boolean hasTeen(int a, int b , int c){
        if ((a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19))
            return true;
        return false;
    }
}
