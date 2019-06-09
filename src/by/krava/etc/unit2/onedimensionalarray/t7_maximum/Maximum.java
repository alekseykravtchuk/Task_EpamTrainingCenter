package by.krava.etc.unit2.onedimensionalarray.t7_maximum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Даны действительные числа a1, a2, ..., a(n), ..., a(2n). Найти
 * max(a1 + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1))
 */

public class Maximum {

    public static void main(String[] args) throws IOException {
        int [] mas;
        int n, index1, index2;
        int max;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение n: ");
        n = Integer.parseInt(reader.readLine());

        //инициализация и заполнение массива рандомными значениями от -1000 до 1000
        mas = new int[2 * n];
        for (int i = 0; i < mas.length; i++) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            mas[i] = (int) (Math.random() * 1000) * sing;
            //System.out.printf("%d ", mas[i]);
        }

        index1 = 0;
        index2 = mas.length - 1;
        max = Integer.MIN_VALUE;
        for ( ; index1 < index2; index1++, index2--) {
            max = Integer.max(mas[index1] + mas[index2], max);
        }

        System.out.println("\n" + max);
    }
}
