package by.tasks.part1.branch.t4_brick;

import java.io.IOException;
import java.util.Scanner;

/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Brick {
    public static void main(String[] args) throws IOException {
        double a, b, x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.");
        System.out.println("Каждое значение в новой строке:");
        a = Double.parseDouble(scanner.nextLine());
        b = Double.parseDouble(scanner.nextLine());
        x = Double.parseDouble(scanner.nextLine());
        y = Double.parseDouble(scanner.nextLine());
        z = Double.parseDouble(scanner.nextLine());

        if ((a >= x && b >= y) || (a >= x && b >= z) || (a >= z && b >= y)) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }
    }

}
