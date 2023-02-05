package academy.learnprogramming;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse ( int [] array){
        System.out.println("Array = " + Arrays.toString(array));
        int [] copyArray = new int [array.length];
        for(int i = 0; i < array.length; i++){
            copyArray[i] = array[i];
        }
        for(int i = 0; i < array.length; i++){
            array[i] = copyArray[array.length - i - 1];
        }

       System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
