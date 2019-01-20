public class Main {

    public static void main(String[] args) {

        CalculateScore(true, 800, 5, 100);
        CalculateScore(true, 10000, 8, 200);
        System.out.println(retCalculateScore(true,10000,8,200));
        int highScore = retCalculateScore(false,10000,8,200);
        System.out.println(highScore);

        //challenge
        displayHighScorePosition("Aris", 2);
        System.out.println(calculateHighScorePosition(999));




    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println("The player: " + name + " Managed to get into position: " + position);
    }

    public static int calculateHighScorePosition(int score){

        int position = 4;
        if(score > 1000)
            position = 1;
        else if (score > 500 && score <1000)
            position = 2;

        else if (score >100 && score < 500)
            position = 3;

        return position;
    }


    public static void CalculateScore(boolean gameover, int score, int leveleCompleted, int bonus) {

        if (gameover == true) {
            int finalScore = score + (leveleCompleted * bonus);
            finalScore += 2000;
            System.out.println("Final score was: " + finalScore);
        }

        else {
            System.out.println("You should continue to play");
        }
    }

    public static int retCalculateScore(boolean gameover, int score, int leveleCompleted, int bonus){
        if(gameover == true)
            return score + (leveleCompleted * bonus);
        else {
            return -1;
        }
    }
}