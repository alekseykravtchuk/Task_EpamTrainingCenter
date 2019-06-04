package by.tasks.part1.line.t4_replacement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Replacement {
    public static void main(String[] args) throws IOException {
        double in, out;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите действительное число R вида nnn.ddd:");
        in = Double.parseDouble(br.readLine());
        out = (int) in / 1000.0 + (in - (int) in) * 1000;
        System.out.println("Полученное значение: " + Math.round(out * 1000d) / 1000d);
    }
}
