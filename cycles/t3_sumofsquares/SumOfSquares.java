package by.tasks.part1.cycles.t3_sumofsquares;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class SumOfSquares {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + sum);
    }
}
