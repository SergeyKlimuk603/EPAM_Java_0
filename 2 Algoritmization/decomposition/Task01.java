package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 1
 *	
 *		Написать метод (методы) для нахождения наибольшего общего делителя
 *	и наименьшего общего кратного двух натуральных чисел:
 *              НОК(А, В) = (А * В) / НОД(А, В)
 *	
 */

public class Task01 {

	public static void main(String[] args) {

        // Заданные числа
        int a = 15;
        int b = 20;

        // Вычисляем НОД
        int gcd = getGcd(a, b);
        // Вычисляем НОК
        int lcm = getLsn(a, b);

        System.out.println("НОД чисел " + a + " и " + b + " = " + gcd);
        System.out.println("НОК чисел " + a + " и " + b + " = " + lcm);
    }

    // Вычисление НОД
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

    // Вычисление НОК
    private static int getLsn(int a, int b) {
        return a * b / getGcd(a, b);
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

НОД чисел 15 и 20 = 5
НОК чисел 15 и 20 = 60

 */