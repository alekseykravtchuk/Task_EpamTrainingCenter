package by.krava.etc.unit2.decomposition.t17_subtract_sum;

/*
 * Из заданного числа вычТи сумму его цифр. Из результата вновь вычТи сумму его
 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию
 */

public class SubtractSum {

    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int n = countSubtraction(225);
        System.out.println("Количество вычитаний: " + n);
    }
}
