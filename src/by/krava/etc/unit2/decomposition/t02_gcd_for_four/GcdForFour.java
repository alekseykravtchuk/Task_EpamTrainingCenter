package by.krava.etc.unit2.decomposition.t02_gcd_for_four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 */

public class GcdForFour {

    public static void main(String[] args) throws IOException {
        int gcd;
        int [] number = fillArray(4);
        gcd = findGcd(number);
        System.out.println("\nНаибольший общий делитель: " + gcd);
    }

    private static int [] fillArray (int n) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число a" + (i + 1) + ":");
            array[i] = Integer.parseInt(rd.readLine());
        }
        return array;
    }

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

}
