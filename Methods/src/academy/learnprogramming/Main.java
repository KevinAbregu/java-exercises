package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + finalScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise",highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int level, int bonus) {

        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (level * bonus);
            finalScore += 2000;
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int positionInHighScoreTable){
        System.out.println(playerName + " managed to get into position " + positionInHighScoreTable + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){

        int finalScore = 4;
        if (score >= 1000){
            finalScore = 1;
        }else if (score >= 500){
            finalScore = 2;
        }else if(score >= 100){
            finalScore = 3;
        }
        return finalScore;


    }
}
