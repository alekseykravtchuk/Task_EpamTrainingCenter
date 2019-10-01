package by.krava.etc.learn_by.collection;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.));
                add(new Order(389, 2.9));
                add(new Order(747, 32.));
                add(new Order(517, 1.7));
                add(new Order(414, 17.));
            }
        };
        System.out.println(orders);
        float bigAmount = 10;
        int percent = 5;
        orders.removeIf(o -> o.getAmount() < bigAmount);
        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - percent) / 100.0));
//        OrderAction action = new OrderAction();
//        action.discountAction(bigAmount, orders, percent);
        System.out.println(orders);
    }
}
