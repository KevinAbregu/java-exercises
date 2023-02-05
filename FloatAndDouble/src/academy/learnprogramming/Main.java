package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println(("MyFloatValue= " + myFloatValue));
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200;
        final double poundsToKilogrames = 0.45359237;
        double numberOfKilogrames = numberOfPounds * poundsToKilogrames;
        System.out.println("Number of Kilogrames = " + numberOfKilogrames);
    }
}
