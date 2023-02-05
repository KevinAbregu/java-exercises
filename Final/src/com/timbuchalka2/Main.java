package com.timbuchalka2;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//
//        int pw = 674312;
//        Password password = new Password(pw);
//        password.storePassword();
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(pw);
//
//        ExtendedPassword extendedPassword = new ExtendedPassword(pw);
//        extendedPassword.storePassword();
//        extendedPassword.getEncryptedPassword();

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }

}
