package by.tasks.part1.branch.t3_pointsonline;

import java.util.Scanner;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class PointsOnLine {
    public static void main(String[] args) {
        Point [] points = new Point[3];
        char pointName = 'A';
        double a, b, c, p, s; //стороны треугольника, полупериметр, площадь
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите координату \"x\" токи " + pointName + ":");
            double x = Double.parseDouble(scanner.nextLine());
            System.out.println("Введите координату \"y\" токи " + pointName++ + ":");
            double y = Double.parseDouble(scanner.nextLine());
            points[i] = new Point(x, y);
        }

        /* растояния между точками находим по теореме Пифагора (c^2 = a^2 + b^2) */
        a = Math.sqrt(Math.pow((points[0].x - points[1].x), 2) + Math.pow((points[0].y - points[1].y), 2));
        b = Math.sqrt(Math.pow((points[0].x - points[2].x), 2) + Math.pow((points[0].y - points[2].y), 2));
        c = Math.sqrt(Math.pow((points[1].x - points[2].x), 2) + Math.pow((points[1].y - points[2].y), 2));
        p = (a + b + c) / 2; //полупериметр
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //площадь треугольника по формуле Герона
        if (s == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }


    private static class Point {
        double x, y;

        Point (double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
