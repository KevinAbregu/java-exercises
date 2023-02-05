package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(customerName)){
                return customers.get(i);
            }
        }
        return null;
    }
    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer actualCustomer = findCustomer(customerName);
        if(actualCustomer != null){
            actualCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null){
            Customer newCustomer = new Customer(customerName,initialTransaction);
            return customers.add(newCustomer);
        }
        return false;
    }
}
