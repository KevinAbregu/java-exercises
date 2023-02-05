package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        System.out.println("Enter Number: ");
        while (scanner.hasNextInt()) {
            int actualValue = scanner.nextInt();
            minValue = Math.min(actualValue, minValue);
            maxValue = Math.max(actualValue, maxValue);
            scanner.nextLine();
            System.out.println("Enter Number: ");
        }
        System.out.println("The Minimum value is: " + minValue + " and the Maximum value is: " + maxValue);
        scanner.close();
    }
}
