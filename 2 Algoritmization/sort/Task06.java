package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 6. Сортировка Шелла
 *	
 *		Дан массив n действительных чисел. Требуется упорядочить его по
 * возрастанию. Делается это следующим образом: сравниваются два соседних
 * элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один 
 * элемент вперед. Если Если ai > a(i + 1), то производится перестановка
 * и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        // Размерности массива
        int n = 10;

        // Создаем массив
        double[] array = getArray(n);

        // Выводим массив на экран
        System.out.print("Заданная последовательность array:\n");
        printArray(array);

        // Сортируем заданную последовательность
        int i = 1;
        while (i < array.length) {
            // Если ai <= a(i + 1) - продвигаемся вперед
            if (array[i - 1] <= array[i]) {
                i++;
                continue;
            // Если ai > a(i + 1) - меняем элементы местами и возвращаемся назад
            } else {
                double temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                if (i > 1) i--;
            }
        }

        // Выводим массив на экран
        System.out.print("Отсортированная последовательность array:\n");
        printArray(array);
    }

    // Создание массива
    static double[] getArray(int n) {
        Random rand = new Random();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextDouble() * 21 - 10;
        }
        return array;
    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f; ", array[i]);
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Заданная последовательность array:
-5,65; 0,11; 9,61; 2,23; 5,01; -4,40; 5,82; -1,56; 5,70; 8,84; 
Отсортированная последовательность array:
-5,65; -4,40; -1,56; 0,11; 2,23; 5,01; 5,70; 5,82; 8,84; 9,61; 

 */