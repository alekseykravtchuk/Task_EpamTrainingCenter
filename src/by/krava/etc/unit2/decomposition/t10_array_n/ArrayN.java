package by.krava.etc.unit2.decomposition.t10_array_n;

/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N
 */

public class ArrayN {

    private static int [] createArray (int n, int x) {  //формирование массива
        int[] arrayN = new int [x];
        for (int i = 0; i < x; i++) {
            arrayN[i] = n;
        }
        return arrayN;
    }

    private static void printArray (int [] array) {  //вывод массива
        for (int element : array) {
                System.out.printf("%3d ", element);
        }
    }

    public static void main(String[] args) {
        int [] arrayN = createArray(51, 23);
        printArray(arrayN);
    }
}
