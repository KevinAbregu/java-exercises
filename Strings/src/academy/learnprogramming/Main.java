package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a String";
	    System.out.println("my String is equal to " + myString);
	    myString = myString + ", and this is more.";
        System.out.println("my String is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("my String is equal to " + myString);
        String numberString = "250.55";
        String lastString = "10";
        String lastString2 = new String();

        int myInt = 50;
        Integer.getInteger(lastString);
        Integer.toString(lastString2,Integer.getInteger(lastString) + myInt);
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.74d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}
