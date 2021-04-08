package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 4
 *	
 *		На плоскости заданы своими координатами "n" точек. Написать метод (методы),
 *   определяющие, между какими из пар точек самое большое расстояние.
 *   Указание. Координаты точек занести в массив.
 *
 *   Решение:
 *   Напишем метод maxDistancePoints, в который будем передавать массив заданных
 *   точек и который будет возвращать массив из двух точек, находящихся на
 *   максимальном расстоянии.
 *   Метод maxDistancePoints будет вызывать метод getDistance, который будет
 *   получать в виде массивa координаты двух точек и возвращать расстояние
 *   между ними.
 *	
 */

public class Task04 {

	public static void main(String[] args) {

        // Массив заданных точек
        double[][] a = {{1, 2}, {5, 8}, {-6, 15}, {7, 14}, {0,11}, {-10, -3}};

        // Выводим на экран заданые точки
        System.out.println("Даны точки с координатами (x, y):");
        printPoints(a);
        System.out.println();

        // Получаем координаты максимально-удаленных точек
        double[][] maxDistancePoints = maxDistancePoints(a);

        // Выводим на экран найденные точки
        System.out.println("Координаты (x, y) максимально-удаленных точек:");
        printPoints(maxDistancePoints);
        System.out.println("Расстояние между точками = " + getDistance(maxDistancePoints));
    }

    // Метод возвращает массив с координатами двух максимально удаленных друг
    // от друга точек
    private static double[][] maxDistancePoints(double[][] points) {
        double[][] maxDistancePoints = new double[2][2];
        double maxDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistance(points[i], points[j]);
                if (maxDistance < distance) {
                    maxDistance = distance;
                    maxDistancePoints[0] = points[i];
                    maxDistancePoints[1] = points[j];
                }
            }
        }
        return maxDistancePoints;
    }

    // Метод возвращает расстояние между двух точек
    private static double getDistance(double[]... a) {
        double distance = Math.sqrt(Math.pow(a[0][0] - a[1][0], 2) + Math.pow(a[0][1] - a[1][1], 2));
        return distance;
    }

    // Вывод на консоль заданных точек
    static void printPoints(double[][] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.print("(" + points[i][0] + ", " + points[i][1] + "), ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Даны точки с координатами (x, y):
(1.0, 2.0), (5.0, 8.0), (-6.0, 15.0), (7.0, 14.0), (0.0, 11.0), (-10.0, -3.0), 

Координаты (x, y) максимально-удаленных точек:
(7.0, 14.0), (-10.0, -3.0), 
Расстояние между точками = 24.041630560342615

 */