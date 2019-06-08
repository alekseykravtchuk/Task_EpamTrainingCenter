package by.krava.etc.unit1.line.t3_expression2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) *  𝑡𝑔 𝑥𝑦
 */

public class Expression {

    public static void main(String[] args) throws IOException {
        double z, x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение \"x\" (значение угла в градусах):");
        x = Math.toRadians(Double.parseDouble(br.readLine())); //в радианах
        System.out.println("Введите значение \"y\" (значение угла в градусах):");
        y = Math.toRadians(Double.parseDouble(br.readLine())); //в радианах
        double devision = Math.cos(x)-Math.sin(y); //делитель
        if (Math.abs(devision) < Math.pow(10, -15)) {
            System.out.println("Деление на 0");
            return;
        }
        z = Math.sin(x) + Math.cos(y);
        z /= Math.cos(x) - Math.sin(y);
        z *= Math.tan(x * y);
        System.out.println("Значение выражения равно: " + z);
    }
}
