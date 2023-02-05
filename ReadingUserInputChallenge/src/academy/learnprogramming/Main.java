package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean hasNextInt = false;
        while(count < 10){
            System.out.println("Insert Number [" + (count + 1) + "] : ");
            if (scanner.hasNextInt()){
                count++;
                int actualValue = scanner.nextInt();
                sum += actualValue;
                System.out.println("Actual value inserted is: " + actualValue);
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }
        scanner.close();
        System.out.println("The total sum is: " + sum);
    }
}
