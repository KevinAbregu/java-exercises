package com.timbuchalka2;

import java.util.Scanner;

public class X {

    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
        x.close();
    }

    public void x(){
        for(int x = 1; x <= 12; x++){
            System.out.println(x*this.x);
        }
    }

    public static void main(String[] args) {
        X x = new X();
        x.x();
        System.out.println("Fin");


    }

}
