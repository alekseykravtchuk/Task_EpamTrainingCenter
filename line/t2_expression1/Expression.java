package by.tasks.part1.line.t2_expression1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((𝑏 + √(𝑏2 + 4𝑎𝑐)) / 2𝑎) − 𝑎3𝑐 + 𝑏^(−2)
 */

public class Expression {
    public static void main(String[] args) throws IOException {
        double z, a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение \"а\":");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Деление на 0");
            return;
        }
        System.out.println("Введите значение \"b\":");
        b = Double.parseDouble(br.readLine());
        System.out.println("Введите значение \"c\":");
        c = Double.parseDouble(br.readLine());
        z = b + Math.sqrt(b * b + 4 * a * c);
        z /= 2 * a;
        z += Math.pow(b, -2) - Math.pow(a, 3) * c;
        System.out.println("Значение выражения равно: " + z);
    }
}
