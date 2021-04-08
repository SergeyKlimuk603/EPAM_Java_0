package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 5
 *	
 *		Составить программу, которая в массиве A[N] находит второе по величине
 *   число (вывести на печать число, которое меньше максимального элемента
 *   массива, но больше всех других элементов).
 *	
 */

public class Task05 {

	public static void main(String[] args) {

        // Заданный массив чисел
        int[] a = {0, 34, 91, -80, 3, -15, -23, 11, 61, 20, 13, 13, 5};

        // Выводим массив на экран
        System.out.println("Дан массив чисел:");
        print(a);
        System.out.println();

        // Находим второе по величине число
        int secondMax = getSecondMax(a);

        System.out.println("Второе по величине число в массиве: "
        					+ secondMax);
    }

    // Метод возвращает второе по величине число в массиве
    private static int getSecondMax(int[] a) {
        int max = a[0];
        int secondMax = a[0];
        for (int x : a) {
            if (max < x)
                max = x;
            if (secondMax < x && x < max)
                secondMax = x;
        }
        return secondMax;
    }

    // Вывод на консоль массива чисел
    private static void print(int[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + "; ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Дан массив чисел:
0; 34; 91; -80; 3; -15; -23; 11; 61; 20; 13; 13; 5; 

Второе по величине число в массиве: 61

 */