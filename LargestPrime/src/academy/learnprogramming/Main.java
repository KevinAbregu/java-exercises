package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number){
        int largestPrime = -1;
        if(number >= 2){
            for(int i = 2; i <= number; i++){
                if(number % i == 0){
                    boolean isPrime = true;
                    for(int j = 2; j < i; j++){
                        if(i % j == 0){
                            isPrime = false;
                        }
                    }
                    if(isPrime){
                        largestPrime = i;
                    }
                }
            }
        }
        return largestPrime;
    }
}
