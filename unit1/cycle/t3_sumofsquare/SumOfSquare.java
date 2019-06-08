package by.krava.etc.unit1.cycle.t3_sumofsquare;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class SumOfSquare {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + sum);
    }
}
