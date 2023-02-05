package academy.learnprogramming;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int valueRead = scanner.nextInt();
        scanner.close();
        return valueRead;
    }
    private static int [] readElements(int size){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return array;
    }
    private static int findMin(int [] array){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(minValue > array[i]){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
