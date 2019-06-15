package by.krava.etc.unit2.sorting_array.t01_join_array;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное
 * число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
 * элементами первого, при этом не используя дополнительный массив.
 */

public class JoinArray {
        private static int [] newArray;

    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] array2 = {11, 12, 13, 14, 15};
        int k = 6;

        newArray = joinArray(array1, array2 , k);
        printArray(newArray);
    }

    private static int [] joinArray (int [] a, int [] b, int k) {
        newArray = new int[a.length + b.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < k) {
                newArray[i] = a[i];
            } else if (i < k + b.length) {
                newArray[i] = b[i - k];
            } else {
                newArray[i] = a[i - k + 1];
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
