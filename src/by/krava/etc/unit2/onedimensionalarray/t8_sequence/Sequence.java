package by.krava.etc.unit2.onedimensionalarray.t8_sequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дана последовательность целых чисел a1, a2, ..., a(n).
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1, a2, ..., a(n)).
 */

public class Sequence {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int [] firstArray;
        int min, n, count;
        int [] secondArray;

        System.out.println("Введите размер для данной последовательности:");
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение последовательности рандомными значениями от -100 до 100
        System.out.println("Данная последовательность:");
        firstArray = new int[n];
        for (int i = 0; i < firstArray.length; i++) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            firstArray[i] = (int) (Math.random() * 100) * sing;
            System.out.printf("%3d ", firstArray[i]);
        }

        //ищем минимальный элемент и считает их количество
        min = Integer.MAX_VALUE;
        count = 0;
        for (int element : firstArray) {
            if (element < min) {
                min = element;
                count = 1;
            } else if (element == min) {
                count++;
            }
        }

        //инициализация и заполнение нового массива
        secondArray = new int[firstArray.length - count];
        for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
            if (firstArray[i] != min) {
                secondArray[j] = firstArray[i];
            } else {
                j--;
            }
        }

        System.out.printf("%n%nЗначение минимального элемента: %d%n", min);

        //вывод второй последовательности
        System.out.println("\nНовая последовательность:");
        for (int element : secondArray) {
            System.out.printf("%3d ", element);
        }
    }
}
