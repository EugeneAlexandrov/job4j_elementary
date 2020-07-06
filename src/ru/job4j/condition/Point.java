package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        double result = Point.distance(1, 0, 2, 0);
        System.out.println("result(1,0)to(2,0)=" + result);

        result = Point.distance(1, 5, 1, 10);
        System.out.println("result(1,5)to(1,10)=" + result);

        result = Point.distance(1, 1, 3, 3);
        System.out.printf("result(1,1)to(3,3)=%3.2f\n", result);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
