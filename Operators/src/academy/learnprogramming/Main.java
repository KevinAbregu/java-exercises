package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println(("4 % 3 = " + result));

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double myTestValue = 20.00;
        double mySecondTestValue = 80.00;
        double sumTestValues = (myTestValue + mySecondTestValue) * 100;
        System.out.println("My Values total = " + sumTestValues);
        double remainder = sumTestValues % 40d;
        System.out.println("The Remainder = " + remainder);
        boolean remainderIs0 = (remainder == 0d) ? true : false;
        System.out.println("Remainder is 0 = " + remainderIs0);

        if(!remainderIs0){
            System.out.println("Got some remainder");
        }

    }
}
