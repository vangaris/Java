public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int leveleCompleted = 5;
        int bonus = 100;

        int finalScore = 0;
        if (gameOver ==true){
            finalScore = score + (leveleCompleted * bonus);
            System.out.println("Final Score:" + finalScore);
        }

        int secondFinalScore = finalScore;
        System.out.println("SecondFinalScore:" + secondFinalScore);
    }
}
