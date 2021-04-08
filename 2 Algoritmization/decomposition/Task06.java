package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 6
 *	
 *		Написать метод (методы), проверяющий, являются ли данные три числа
 * взаимно простыми
 *
 * Решение:
 * Взаимно простые числа - числа у которых НОД = 1.
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        // Заданный массив чисел
        int[] a = {5, 3, 9};

        String s = "Числа: " + arrayToString(a);
        // Определяем являются ли числа в массиве взаимно простыми
        if (!isSimple(a))
            s += " не";
        s += " являются взаимно простыми";
        System.out.println(s);
    }

    // Метод определяет, по НОД, являются ли числа в массиве взаимно простыми
    private static boolean isSimple(int[] array) {
        if (getArrayGcd(array) == 1)
            return true;
        return false;
    }

    // Вычисление НОД массива чисел
    private static int getArrayGcd(int[] array) {
        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = getGcd(gcd, array[i]);
        }
        return gcd;
    }

    // Вычисление НОД двух чисел
    private static int getGcd(int a, int b) {
        // Создаем массив временных переменных (так будет удобнее менять
        // числа местами в отдельном методе)
        int[] s = {a, b};

        if (s[1] > s[0])
            swap(s);
        while (s[1] > 0) {
            s[0] %= s[1];
            swap(s);
        }
        return s[0];
    }

    // Меняем числа местами
    private static int[] swap(int[] s) {
        int temp = s[0];
        s[0] = s[1];
        s[1] = temp;
        return s;
    }

    // Вывод на консоль массива чисел
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

Числа:  5; 3; 9;  являются взаимно простыми

Второе по величине число в массиве: 61

 */