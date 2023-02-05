package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while(count != 6){
//            System.out.println("Count Value is " + count);
//            count++;
//        }
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
//
//        count = 6;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100){
//                break;
//            }
//        }while (count != 6);
        int number = 4;
        int finishNumber = 20;
        int amountEvenNumbers = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            amountEvenNumbers++;
            System.out.println("Even number " + number);
            if(amountEvenNumbers == 5){
                break;
            }
        }
        System.out.println("Total Amount of Even Number: " + amountEvenNumbers);

    }

    public static boolean isEvenNumber(int number){
        if(number == 0){
            return true;
        }

        return (number % 2 == 0);
    }
}
