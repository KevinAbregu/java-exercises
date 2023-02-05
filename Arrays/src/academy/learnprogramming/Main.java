package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("Average is: " + getAverage(myIntegers));

    }

    private static int [] getIntegers(int size){
        int [] myIntArray = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Give me a number: ");
            myIntArray[i] = scanner.nextInt();
        }
        return myIntArray;
    }

    private static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " has a value of: " + array[i]);
        }
    }
    private static double getAverage(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }
}
