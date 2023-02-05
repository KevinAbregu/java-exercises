package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch actualBranch = findBranch(branchName);
        if (actualBranch == null) {
            return branches.add(new Branch(branchName));
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch actualBranch = findBranch(branchName);
        if (actualBranch != null) {
            return actualBranch.newCustomer(customerName, transaction);
        }

        return false;

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch actualBranch = findBranch(branchName);
        if (actualBranch != null) {
            return actualBranch.addCustomerTransaction(customerName, transaction);
        }
        return false;

    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;

    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch actualBranch = findBranch(branchName);
        if (actualBranch != null) {
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> customerArrayList = actualBranch.getCustomers();

            for (int i = 0; i < customerArrayList.size(); i++) {
                System.out.println("Customer: " + customerArrayList.get(i).getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customerArrayList.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                    }
                }
            }

            return true;

        }
        return false;

    }

}
