package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScores();
        calcFeetAndInchesToCentimeters(6,5);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScores() {
        System.out.println("No player name, no player score. ");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet < 0 || (inches < 0 || inches > 12)){
            return -1;
        }
        double totalInches = inches + feet * 12;
        double totalCentimeters = totalInches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + totalCentimeters + " cm");

        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double newInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + newInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,newInches);
    }
}
