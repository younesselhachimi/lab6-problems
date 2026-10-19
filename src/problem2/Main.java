package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");
        Customer customer1 = new Customer("Ali");
        Customer customer2 = new Customer("Youness");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.addTransaction(customer1, 100.0);
        bank.addTransaction(customer1, -50.0);
        bank.addTransaction(customer2, 200.0);
        bank.addTransaction(new Customer("Amine"), 25.0);


        bank.printStatement(customer1);
        bank.printStatement(customer2);
    }
}
