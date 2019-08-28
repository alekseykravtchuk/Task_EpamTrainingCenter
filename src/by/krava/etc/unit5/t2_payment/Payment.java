package by.krava.etc.unit5.t2_payment;

import java.util.ArrayList;
import java.util.Collections;

public class Payment {
    private Receipt receipt;
    private Currency currency;
    private double balance;

    public Payment(Currency currency, Product ... prod) {
        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, prod);
        receipt = new Receipt(products);
        this.currency = currency;
        int temp = (int)(receipt.getBalance() * currency.getRate() * 100);
        balance = (double) temp / 100;
        System.out.println(String.format("Check amount: %.2f %s. You want to pay in %ss. ",
                                        receipt.getBalance(), "dollars", currency.getName()));
        System.out.println(String.format("You need to pay %.2f %ss.", balance, currency.getName()));
    }

    public void makePayment(Currency currency, double deposit) {
        if(balance < deposit) {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getName()));
            double change = deposit - balance;
            System.out.println(String.format("Your change is %.2f %ss.", change, currency.getName()));

        } else if(balance == deposit) {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getName()));
            System.out.println("Thank you for paying without change.");
        } else {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getName()));
            balance -= deposit;
            System.out.println(String.format("Balance of payment: %.2f %ss.", balance, this.currency.getName()));
        }
    }

    public static class Receipt {
        private ArrayList<Product> products;
        private double balance;

        public Receipt(ArrayList<Product> products) {
            this.products = products;
            balance = getTotalPrice();
        }

        public double getTotalPrice() {
            double totalPrice = 0;
            for (Product product: products) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProdact(Product product){
            products.remove(product);
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Receipt{" +
                    "products=" + products +
                    ", balance=" + balance +
                    '}';
        }
    }
}
