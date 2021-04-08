package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 11
 *	
 *		Написать метод (методы), определяющий, в каком из данных двух 
 *  чисел больше цифр.
 *	
 */

public class Task11 {

	public static void main(String[] args) {

        Random rand = new Random();

        // Разрядность случайных чисел
        int m1 = rand.nextInt(19);
        int m2 = rand.nextInt(19);

        // Создаем случайные числа с заданной разрядностью
        long n1 = getNumber(m1);
        long n2 = getNumber(m2);
        System.out.println("N1 = " + n1);
        System.out.println("N2 = " + n2);

        String s = "Разрядность числа N1 ";
        if (compareNumbers(n1, n2)) {
            s += "больше ";
        } else {
            s += "меньше либо равна ";
        }
        s += "разрядности числа N2";
        System.out.println(s);
    }

    // Метод возвращает случайное число с разрядностью n
    private static long getNumber(int m) {
        Random rand = new Random();
        long number = 0;
        for (int i = 0; i < m; i++) {
            number += rand.nextInt(10) * Math.pow(10, i);
        }
        return number;
    }

    // Метод возвращает true если разрядность n1 больше чем разрядность n2
    private static boolean compareNumbers(long n1, long n2) {
        if (getNumberSize(n1) > getNumberSize(n2)) {
            return true;
        }
        return false;
    }

    // Определяем количество цифр в числе
    private static int getNumberSize(long n) {
        int m = 1;
        while (n > 9) {
            n = n / 10;
            m++;
        }
        return m;
    }
}

/*
   Результат работы программы:

N1 = 90860592
N2 = 211
Разрядность числа N1 больше разрядности числа N2

 */