package by.krava.etc.unit2.decomposition.t11_more_digit;

/*
 *  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class MoreDigits {

    private static String countDigitsCompare(int first, int second) {
        int firstCount = (int)(Math.log10(Math.abs(first))+1);
        int secondCount = (int)(Math.log10(Math.abs(second))+1);
        System.out.println(firstCount + " против " + secondCount);
        if (firstCount == secondCount) {
            return "Длина одинакова";
        } else {
            return (firstCount > secondCount) ? ("Первое длиннее") : ("Второе длиннее");
        }
    }

    public static void main(String[] args) {
        System.out.println(countDigitsCompare(99999, -8888));
        System.out.println(countDigitsCompare(-199999, 299999));
    }
}
