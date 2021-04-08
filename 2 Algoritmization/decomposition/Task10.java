package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 10
 *	
 *		Дано натуральное число N. Написать метод (методы) для 
 *  формирования массива, элементами которого являются цифры числа N.
 *	
 */

public class Task10 {

	public static void main(String[] args) {

        Random rand = new Random();

        // Заданное натуральное число
        long n = Math.abs(rand.nextLong());
        System.out.println("Заданное число\nN = " + n);

        // Выводим на консоль число в виде массива
        System.out.println("Заданное число в виде массива чисел:");
        print(getArray(n));
    }

    // Получаем массив
    private static int[] getArray(long n) {
        // Определяем размерность массива
        int m = getArraySize(n);
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = (int) (n % 10);
            n /= 10;
        }
        return a;
    }

    // Определяем количество цифр в числе
    private static int getArraySize(long n) {
        int m = 1;
        while (n > 9) {
            n = n / 10;
            m++;
        }
        return m;
    }

    // Вывод на консоль массива чисел
    private static void print(int[] points) {
        for (int i = points.length - 1; i >= 0; i--) {
            System.out.print(points[i] + "; ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Заданное число
N = 7545767953746554306
Заданное число в виде массива чисел:
7; 5; 4; 5; 7; 6; 7; 9; 5; 3; 7; 4; 6; 5; 5; 4; 3; 0; 6; 

 */