package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 2
 *	
 *		Написать метод (методы) для нахождения наибольшего общего делителя
 *   четырех натуральных чисел.
 *
 *   Решение:
 *   Находим НОД первых двух чисел, затем находим НОД пары из только что
 *   полученного НОД и следующего числа и т.д.
 *   НОД(a1, a2)=d2, НОД(d2, a3)=d3, НОД(d3, a4)=d4, …, НОД(dk-1, ak)=dk.
 *	
 */

public class Task02 {

	public static void main(String[] args) {

        // Заданные числа представим в виде массива
        int[] a = {56, 28, 168, 7};

        // НОД массива
        int gcd = getArrayGcd(a);

        // Выводим результат на экран
        System.out.print("НОД чисел ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("=  " + gcd);
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
}

/*
   Результат работы программы:

НОД чисел 56, 28, 168, 7, =  7

 */