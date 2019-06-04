package by.tasks.part1.branch.t1_triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

public class Triangle {
    public static void main(String[] args) throws IOException {
        double x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите угол \"x\" (в градусах):");
        x = Double.parseDouble(br.readLine());
        System.out.println("Введите угол \"y\" (в градусах):");
        y = Double.parseDouble(br.readLine());

        if ((x + y) >= 180) {
            System.out.println("Такой треугольник не может существовать");
        } else if (x == 90 || y == 90 || (x + y) == 90) {
            System.out.println("Треугольник существует. Он прямоугольный.");
        }else {
            System.out.println("Треугольник существует. Он не прямоугольный.");
        }
    }
}
