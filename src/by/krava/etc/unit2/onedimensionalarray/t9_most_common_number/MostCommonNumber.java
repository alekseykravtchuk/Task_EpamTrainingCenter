package by.krava.etc.unit2.onedimensionalarray.t9_most_common_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
 * число. Если таких чисел несколько, то определить наименьшее из них.
 */

public class MostCommonNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int [] array;
        int n, count, mostCommon, mostCount;

        System.out.println("Введите размер массива:");
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение последовательности рандомными значениями от -100 до 100
        System.out.println("Данная последовательность:");
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * sing;
            System.out.printf("%d ", array[i]);
        }

        //поиск наиболее часто встречающегося числа
        mostCount = count = 1;
        mostCommon = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > mostCount) {
                mostCommon = array[i];
                mostCount = count;
            } else if (count == mostCount) {
                if (array[i] < mostCommon) {
                    mostCommon = array[i];
                }
            }
            count = 1;
        }

        System.out.printf("%nНаиболее часто встречающееся наименьшее число:" +
                " %d.%nОно встречается %d раз(а)", mostCommon, mostCount);
    }
}
