package by.krava.etc.unit2.decomposition.t06_mutually_simple;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class MutuallySimple {

    private static int findGcd(int [] number) {
        int a = Math.abs(number[0]);
        for (int element : number) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }

    private static boolean isMutually (int[] a) {
        return findGcd(a) == 1;
    }

    public static void main(String[] args) {
        //int [] array = {12, 21, 19};
        int [] array = {15, 25, 50};
        System.out.println(isMutually(array));
    }
}
