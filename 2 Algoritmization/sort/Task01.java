package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 1
 *	
 *		Заданы два одномерных массива с различным количеством элементов и
 *   натуральное число k. Объединить их в один массив, включив второй массив
 *   между k-м и (k+1) - м элементами первого, при этом не используя
 *   дополнительный массив.
 *	
 */

public class Task01 {

	public static void main(String[] args) {

        // 0 <= k < n1
        int k = 5;

        // Размерности массивов
        int n1 = 10;
        int n2 = 7;

        // Создаем массивы
        int[] array1 = getArray(n1);
        int[] array2 = getArray(n2);

        // Проверяем корректность входных данных
        if (k < 0 || k >= n1) {
            System.out.println("Неверные входные данные (значение k), "
            		+ "исправьте и перезапустите программу");
            System.exit(1);
        }

        // Выводим массивы на экран
        System.out.print("array1 = ");
        printArray(array1);
        System.out.print("array2 = ");
        printArray(array2);

        // Формируем новую строку из двух массивов
        System.out.print("arraySum = ");
        for (int i = 0; i <= k; i++) {
            System.out.print(array1[i] + ", ");
        }
        for (int i = 0; i < n2; i++) {
            System.out.print(array2[i] + ", ");
        }
        for (int i = k + 1; i < n1; i++) {
            System.out.print(array1[i] + ", ");
        }
    }

    // Создание массива
    static int[] getArray(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(21) - 10;
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

array1 = 9, 6, -3, -3, -7, -5, 2, -5, 8, 9, 
array2 = -5, 2, 7, -1, 5, -1, -8, 
arraySum = 9, 6, -3, -3, -7, -5, -5, 2, 7, -1, 5, -1, -8, 2, -5, 8, 9, 

 */