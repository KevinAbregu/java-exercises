package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int [] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int [] myArray = new int [size];
        for(int i = 0; i < size; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int [] sortIntegers(int [] array){
        int [] mySortedArray = new int[array.length];
        int maxValue;
        int temp;
        for(int i = 0; i < array.length; i++) {
            maxValue = Integer.MIN_VALUE;
            temp = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j] > maxValue){
                    maxValue = array[j];
                    temp = j;
                }
            }
            array[temp] = Integer.MIN_VALUE;
            mySortedArray[i] = maxValue;
        }
        return mySortedArray;

    }
}
