package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));

        }
        int amountPrimes = 0;
        for (int i = 10; i < 50 ; i++){
            if(isPrime(i)){
                amountPrimes++;
                System.out.println("Number " + i + " is a prime number");
                if(amountPrimes == 3){
                    System.out.println("Exiting from loop");
                    break;
                }
            }

        }
        System.out.println("Number of primes: " + amountPrimes);
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
