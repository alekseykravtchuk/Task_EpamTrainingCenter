package by.krava.etc.unit2.onedimensional_array.t10_compress_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из
 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

public class CompressArray {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int [] array;
        int n;

        System.out.println("Введите размер массива:");
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение массива рандомными значениями от -100 до 100
        System.out.println("Данная последовательность:");
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * sing;
            System.out.printf("%d ", array[i]);
        }

        //выбрасываем каждый второй элемент
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
    }
}
