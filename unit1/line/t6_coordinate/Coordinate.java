package by.krava.etc.unit1.line.t6_coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */
public class Coordinate {
    public static void main(String[] args) throws IOException {
        double x, y;
        boolean flag;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите координату \"х\":");
        x = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите координату \"y\":");
        y = Double.parseDouble(bufferedReader.readLine());
        flag = (x >= -4 && x <= 4 && y >= -3 && y <=0) || (x >= -2 && x <= 2 && y >= 0 && y <=4);
        System.out.println(flag);
    }
}
