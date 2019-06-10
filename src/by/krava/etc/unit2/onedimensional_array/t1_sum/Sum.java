package by.krava.etc.unit2.onedimensional_array.t1_sum;

/*
 *  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */

public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        int [] array = {25, 15, 30, 55, 60, 10, 100, 17, 81, 90};
        int k = 2;

        for (int element : array) {
            if (element % k == 0) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}
