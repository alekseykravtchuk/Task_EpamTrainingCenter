package by.krava.etc.unit2.decomposition.t04_distance_between_point;

/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */

public class DistanceBetweenPoint {
    private static double maxDistance;

    public static void main(String[] args) {
        int [][] points = initialPoint();
        int [] result = findPointWithMaxDistance(points);
        System.out.printf("Максимальное растояние между точками %d и %d: %f.%n",
                            result[0], result[1], maxDistance);
    }

    private static int [][] initialPoint () {
        return new int[][] {{2, 3}, {-6, -9}, {10, 1}, {-5, 6}, {5, 11},
                {-1, 0}, {0, 7}, {3, 8}, {9, -8}, {2, 15}};
    }

    private static double countDistance (int [][] points) {
        return Math.sqrt(Math.pow((points[0][0] - points[1][0]), 2)
                + Math.pow((points[0][1] - points[1][1]), 2));
    }

    private static int [] findPointWithMaxDistance (int [][] points) {
        int [] result = new int[2];
        double distance;
        maxDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int [][] currentPoints = {{points[i][0], points[i][1]},
                                         {points[j][0], points[j][1]}};
                distance = countDistance(currentPoints);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}
