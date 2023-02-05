public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(249));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

    }
    private static int sumDigits(int number){
        int sum = 0;
        if (number >= 10){
            while(number != 0){
                sum += number % 10;
                number = number/10;

            }
        }else{
            return -1;
        }
        return sum;
    }

}
