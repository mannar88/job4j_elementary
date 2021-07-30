    package ru.job4j.condition;

    public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
            int minX = x2 - x1;
            int minY = y2 - y1;
            double firstX = Math.pow(minX, 2);
            double firstY = Math.pow(minY, 2);
            double rsl = Math.sqrt(firstX + firstY);
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            System.out.println("result (0, 0) to (2, 0) " + result);
            result = Point.distance(2, 5, 7, 0);
            System.out.println("result (2, 5) to (7, 0) " + result);

        }
    }