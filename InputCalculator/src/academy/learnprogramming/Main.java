package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;
        while(scanner.hasNextInt()){
            int actualValue = scanner.nextInt();
            sum += actualValue;
            count++;
        }
        if(count > 0) {
            average = Math.round((double) sum / count);
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
