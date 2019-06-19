package by.krava.etc.unit2.decomposition.t01_gcd_and_lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */

public class GcdAndLcm {

    public static void main(String[] args) throws IOException {
        int a, b;
        int gcd, lcm;

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два натуральных числа:");

        a = Integer.parseInt(rd.readLine());
        b = Integer.parseInt(rd.readLine());
        gcd = findGcd(a, b);
        System.out.println("Наибольший общий делитель: " + gcd);
        lcm = findLcm(a, b);
        System.out.println("Наименьшее общее кратное: " + lcm);

    }

    private static int findGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = 0; i < 2; i++) {
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

    private static int findLcm(int a, int b) {
        return Math.abs(a * b / findGcd(a, b));
    }
}
