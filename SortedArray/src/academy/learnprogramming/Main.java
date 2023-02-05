package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int [] myArray = SortedArray.getIntegers(5);
        SortedArray.printArray(myArray);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        int [] mySortedArray = SortedArray.sortIntegers(myArray);
        SortedArray.printArray(mySortedArray);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        SortedArray.printArray(myArray);

    }
}
