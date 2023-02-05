package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        Bank bobsAccount = new Bank("12345",0.00,"Bob Brown","myemail@bob.com","(087) 123-4567");
//        bobsAccount = new Bank();
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getAccountBalance());
//        bobsAccount.withdrawalFunds(100.0);
//        bobsAccount.depositFunds(50.0);
//        bobsAccount.withdrawalFunds(100.0);
//        bobsAccount.depositFunds(51.0);
//        bobsAccount.withdrawalFunds(100.0);
//
//        Bank timsAccount = new Bank("Tim","tim@email.com","12345");
//        System.out.println(timsAccount.getAccountNumber());
//        System.out.println(timsAccount.getCustomerName());

        VipCustomer bobCustomer = new VipCustomer("bob",1500,"bob@gmail.com");
        System.out.println(bobCustomer.getName() + " " + bobCustomer.getCreditLimit() + " " + bobCustomer.getEmailAddress());
        VipCustomer person2 = new VipCustomer();
        System.out.println(person2.getName() + " " + person2.getCreditLimit() + " " + person2.getEmailAddress());
        VipCustomer person3 = new VipCustomer("Tim","tim@gmail.com");
        System.out.println(person3.getName() + " " + person3.getCreditLimit() + " " + person3.getEmailAddress());

    }
}
