package org.jdekha;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double perimeter(int[][] point) {
        double perimeter = 0;
        perimeter += point(point[0], point[1]);
        perimeter += point(point[0], point[2]);
        perimeter += point(point[1], point[2]);
        return perimeter;
    }

    public static double point(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}