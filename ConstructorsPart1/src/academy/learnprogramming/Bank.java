package academy.learnprogramming;

public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("56789",2.50,"Default name","Default address","Default phone");

        System.out.println("Empty Constructor called");
    }
    public Bank(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Contructor with parameters Called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("99999",100.55,customerName,email,phoneNumber);
    }

    public void depositFunds(double number){
        this.accountBalance += number;
        System.out.println("Deposit of " + number + " made. New balance is " + this.accountBalance);
    }
    public void withdrawalFunds(double withdrawalAmount){
        if(this.accountBalance - withdrawalAmount >= 0){
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " proccesed, Remaining balance: " + this.accountBalance);
        }else{
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
