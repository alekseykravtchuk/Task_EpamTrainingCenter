package by.krava.etc.unit5.t2_payment;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("hair dryer", 100253, 30.6);
        Product p2 = new Product("vacuum cleaner", 120222, 105.99);
        Product p3 = new Product("microwave", 115125, 121.11);
        Product p4 = new Product("oven", 115135, 499.90);
        Product p5 = new Product("refrigerator", 115175, 599.9);

        Payment payment1 = new Payment(Currency.USD, p1, p2, p3, p4, p5);
        payment1.makePayment(Currency.USD, 1300);
        payment1.makePayment(Currency.USD, 57.5);

        System.out.println("___________________");
        Payment payment2 = new Payment(Currency.EUR, p1, p2, p4, p5);
        payment2.makePayment(Currency.EUR, 1150);

        System.out.println("___________________");
        Payment payment3 = new Payment(Currency.BYN, p3, p5);
        payment3.makePayment(Currency.BYN, 1300);
        payment3.makePayment(Currency.BYN, 300);
    }
}
