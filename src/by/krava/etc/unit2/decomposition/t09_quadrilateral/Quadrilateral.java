package by.krava.etc.unit2.decomposition.t09_quadrilateral;
/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Quadrilateral {

    //делим четырехугольник на 2 треугольника
    private static double calculateSquare(double x, double y, double z, double t) {
        //находим сторону треугольник по теореме Пифагора
        double diagonal = Math.sqrt(x * x + y * y);
        //площадь первого треугольника
        double s1 = x * y / 2;

        //площадь второго треугольника по формуле Герона
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));

        return  s1 + s2;
    }

    public static void main(String[] args) {
        double quadrilateral = (float) calculateSquare(3, 7, 3, 5);
        System.out.println(quadrilateral);
    }
}
