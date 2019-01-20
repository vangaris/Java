public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,46));
    }


    public static boolean isCatPlaying (boolean summer, int temprerature){

        if(temprerature >= 25 && temprerature <= 35 && !summer)
            return true;
        else if (temprerature >= 25 && temprerature <= 45 && summer)
            return true;
        else
            return false;
    }
}
