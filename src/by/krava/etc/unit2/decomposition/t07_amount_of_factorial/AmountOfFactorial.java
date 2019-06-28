package by.krava.etc.unit2.decomposition.t07_amount_of_factorial;

/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
 * от 1 до 9.
 */

public class AmountOfFactorial {

    public static void main(String[] args) {
        int [] array = {1, 3, 5, 7, 9};

        AmountOfFactorial item = new AmountOfFactorial();
        System.out.println(item.amountFactorial(array));
    }

    private int amountFactorial (int [] array) {
        int amount = 0;
        for (int element : array) {
            amount += factorial(element);
        }
        return amount;
    }

    private int factorial (int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

}
