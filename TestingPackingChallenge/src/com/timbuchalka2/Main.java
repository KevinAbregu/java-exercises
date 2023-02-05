package com.timbuchalka2;

import com.timbuchalka.Series;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            System.out.println("############");
            System.out.println("nSum of " + i + " : " + Series.nsum(i));
            System.out.println("factorial of " + i + " : " + Series.factorial(i));
            System.out.println("fibonacci of " + i + " : " + Series.fibonacci(i));
        }


    }
}
