package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 9
 *	
 *		Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать 
 *	метод (методы) вычисления его площади, если угол между сторонами 
 *	длиной X и Y - прямой.
 *
 *	Решение:
 *  Разделим четырехугольник на два треугольника, один из которых  - 
 *  прямоугольный и найдем сумму площадей каждого треугольника по трем 
 *  сторонам по формуле:
 *            Sтр. = sqrt(p * (p - a) * (p - b) * (p - c))
 *            где: a, b, c - стороны треугольника
 *            p - полупериметр треугольника по формуле:
 *            p = (a + b + c) / 2
 *	
 */

public class Task09 {

	public static void main(String[] args) {

        Random rand = new Random();

        // Стороны четырехугольника
        double x;
        double y;
        double z;
        double t;
        // Гипотенуза прямоугольного треугольника (общая сторона двух треугольников)
        double xy;

        // Создаем и проверяем возможность существования четырехугольника с полученными
        // сторонами и (как минимум) одним прямым углом
        do {
            x = rand.nextInt(10) + 1;
            y = rand.nextInt(10) + 1;
            z = rand.nextInt(10) + 1;
            t = rand.nextInt(10) + 1;
            xy = Math.sqrt(x * x + y * y);

        } while (xy >= (z + t) || z >= (xy + t) || t >= (xy + z));

        // Площадь четырехугольника равна сумме площадей двух треугольников
        double s = getTriangleArea(x, y, xy) + getTriangleArea(z, t, xy);

        System.out.println("Стороны четырехугольника:");
        System.out.print("x = " + x + "; ");
        System.out.print("y = " + y + "; ");
        System.out.print("z = " + z + "; ");
        System.out.println("t = " + t + "; ");
        System.out.println("Площадь четырехугольника:\nS = " + s);
    }

    // Вычисление площади треугольника по трем сторонам
    private static double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}

/*
   Результат работы программы:

Стороны четырехугольника:
x = 10.0; y = 2.0; z = 9.0; t = 5.0; 
Площадь четырехугольника:
S = 32.49444375840399

 */