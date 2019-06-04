package by.tasks.part1.cycles.t4_prodгctofsquares;

/*
 *  Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

import java.math.BigInteger;

public class ProductOfSquares {
    public static void main(String[] args) {
        BigInteger prod = BigInteger.valueOf(1);

        for (int i = 2; i <= 200; i++) {
            prod = prod.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(prod);

    }
}
