package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        boolean exist = false;

        for (Customer c : customers) {
            if (c.getName().trim().equalsIgnoreCase(customer.getName().trim())) {
                exist = true;
                break;
            }
        }

        if (!exist) {
            customers.add(customer);
        }
    }

    public void addTransaction(Customer customer, double amount) {
        boolean exist = false;

        for (Customer c : customers) {
            if (c.getName().trim().equalsIgnoreCase(customer.getName().trim())) {
                c.addTransactions(amount);
                exist = true;
                break;
            }
        }

        if (!exist) {
            System.out.println("Customer not found in the bank.");
        }
    }

    public void printStatement(Customer customer) {
        System.out.println("Statement for " + customer.getName() + ":");

        double total = 0;
        for (double transaction : customer.getTransactions()) {
            System.out.printf("- Transaction:" + transaction+"\n" );
            total += transaction;
        }

        System.out.printf("Total balance:" + total+"\n");
    }
}