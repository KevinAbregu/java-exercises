package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = 0;


//        if( score < 5000 && score >= 1000){
//            System.out.println("Your score was 5000");
//        }else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//
//        }else {
//            System.out.println("Got Here!");
//        }

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
        }

    }
}
