package by.krava.etc.unit2.decomposition.t03_hexagon_area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
 * вычисления площади треугольника.
 */

public class HexagonArea {

    public static void main(String[] args) throws IOException {
        int side;
        double hexagonArea;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введиде длину стороны шестиугольника: ");
        side = Integer.parseInt(rd.readLine());
        hexagonArea = calculateAreaOfHexagon(side);
        System.out.printf("Площадь шестиугольника со стороной %d равна %f", side, hexagonArea);
    }

    private static double calculateAreaOfTriangle (double side) {
        return Math.sqrt(3) * side * side / 4;
    }

    private static double calculateAreaOfHexagon (double side) {
        return calculateAreaOfTriangle(side) * 6;
    }
}
