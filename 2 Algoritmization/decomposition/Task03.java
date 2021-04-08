package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 3
 *	
 *		Вычислить площадь правильного шестиугольника со стороной a,
 *	 используя метод вычисления площади треугольника
 *
 *   Решение:
 *   Правильный шестиугольник состоит из шести равносторонних 
 *   треугольников. Площадь равностороннего треугольника со стороной "a" 
 *   вычисляется по формуле:
 *              S = a^2 * sqrt(3) / 4
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        // Сторона правильного шестиугольника
        double a = 5;

        // Площадь правильного шестиугольника
        double s = 6 * regularTriangleArea(a);

        System.out.print("S = " + s);
    }

    private static double regularTriangleArea(double a) {
        return a * a * Math.sqrt(3) / 4;
    }
}

/*
   Результат работы программы:

S = 64.9519052838329

 */