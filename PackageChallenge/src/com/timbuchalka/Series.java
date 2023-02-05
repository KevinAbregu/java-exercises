package com.timbuchalka;

public class Series {

    public static int nsum(int n){
        if(n < 0){
            return -1;
        }else{
            int sum = 0;
            for(int i = 0; i <= n; i++){
                sum += i;
            }
            return sum;
        }
    }

    public static int factorial(int n){
        if(n < 0){
            return -1;
        }else if(n==0){
            return 0;
        }else{

            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            return fact;
        }
    }

    public static int fibonacci(int n){
        if(n < 0){
            return -1;
        }else{
            if(n == 0){
                return 0;
            }else if(n == 1){
                return 1;
            }
            int fibbo = 0;
            fibbo = fibonacci(n-1) + fibonacci(n-2);
            return fibbo;
        }
    }
}
