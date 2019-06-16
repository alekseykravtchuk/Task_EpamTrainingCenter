package by.krava.etc.unit2.sorting_array.t02_new_sequence;

/*
 * Даны две последовательности (неубывающие). Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

public class NewSequence {
    private static int [] newArray;

    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 6, 8, 12, 22, 31, 32, 34};
        int [] array2 = {11, 15, 16, 21, 22};

        newArray = joinArray(array1, array2);

        System.out.println("Первая последовательность:");
        printArray(array1);
        System.out.println("\n\nВторая последовательность:");
        printArray(array2);
        System.out.println("\n\nНовая последовательность:");
        printArray(newArray);
    }

    private static int [] joinArray (int [] a, int [] b) {
        newArray = new int[a.length + b.length];

        //join
        for (int i = 0; i < newArray.length; i++) {
            if (i < a.length) {
                newArray[i] = a[i];
            } else {
                newArray[i] = b[i - a.length];
            }
        }

        //sorting
        for (int i = newArray.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    private static void printArray (int [] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}
