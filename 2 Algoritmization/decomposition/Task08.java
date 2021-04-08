package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 8
 *	
 *		Задан массив D. Определить следующие суммы: 
 *	D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 *  Пояснение. Составить метод (методы) для вычисления суммы трех 
 *  последовательно расположенных элементов массива с номерами от k до m.
 *	
 */

public class Task08 {

	public static void main(String[] args) {
        
        // Массив D
        int n = 7; //размерность массива D
        int[] d = getArray(n);

        // Выводим полученный массив D на консоль
        System.out.println("Массив D: " + arrayToString(d));

        // Массив номеров первых элементов выводимых троек
        int[] a = {1, 3, 4};

        // Выводим суммы троек, первые элементы которых заданны в массиве "a".
        for (int i : a) {
            System.out.println("Sum" + i + " = " + getChain(d, i));
        }
    }

    // Вычисление суммы трех элементов массива начиная от элемента с индексом k
    private static int getChain(int[] d, int k) {
        int sum = 0;
        for (int i = k; i < k + 3; i++) {
            sum += d[i];
        }
        return sum;
    }

    // Формируем массив случайных чисел
    private static int[] getArray(int n) {
        int[] d = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            d[i] = rand.nextInt(21) - 10;
        }
        return d;
    }

    // Строковое представление массива чисел
    private static String arrayToString(int[] points) {
        String s = " ";
        for (int i = 0; i < points.length; i++) {
            s += points[i] + "; ";
        }
        return s;
    }
}

/*
   Результат работы программы:

Массив D:  2; -3; -8; 0; 6; -6; -6; 
Sum1 = -11
Sum3 = 0
Sum4 = -6

 */