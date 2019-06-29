package by.krava.etc.unit2.decomposition.t12_amount_k;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class AmountK {

    private static int [] createArray (int k, int n) {
        int [] array = new int[k];
        int i;
        for (i = 0; i < array.length && k > n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            k -= array[i];
        }
        array[i] = k;
        int [] arrayA = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            arrayA[j] = array[j];
        }
        return arrayA;
    }

    private static void printArray (int [] array) {  //вывод массива
        for (int element : array) {
            System.out.printf("%3d ", element);
        }
    }

    public static void main(String[] args) {
        int [] arrayA = createArray(99, 10);
        printArray(arrayA);
    }
}
