package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 3. Сортировка выбором
 *	
 *		Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется 
 *	переставить элементы так, чтобы они были расположены по убыванию. Для
 *  этого в массиве, начиная с первого, выбирается наибольший элемент и 
 *  ставится на первое место, а первый - на место наибольшего. Затем, 
 *  начиная со второго, эта процедура повторяется. Написать алгоритм
 *  сортировки выбором
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        // Создаем массив согласно условия задания
        int[] array = {-5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10};

        // Выводим массив на экран
        System.out.print("Массив array = ");
        printArray(array);

        // Сортируем массив
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;// Индекс максимального элемента
            for (int k = i + 1; k < array.length; k++) {
                if (array[max] < array[k]) max = k;
            }
            if (max == i) continue;
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }

        // Выводим массив на экран
        System.out.print("Отсортированный массив array = ");
        printArray(array);
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

Массив array = -5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10, 
Отсортированный массив array = 10, 10, 7, 5, 4, 3, 2, 0, 0, -3, -5, -5, 

 */