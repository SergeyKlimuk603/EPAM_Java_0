package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 4. Сортировка обменами
 *	
 *		Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется
 * переставить числа в порядке возрастания. Для этого сравниваются два
 * соседних числа ai и a(i+1), то делается перестановка. Так продолжается 
 * до тех пор, пока все элементы не станут расположены в порядке возрастания/.
 * Составить алгоритм сортировки, подсчитывая при этом количества
 * перестановок.
 *
 * Непонятно условие задачи: зачем сортировать отсортированный массив?
 *	
 */

public class Task04 {

	public static void main(String[] args) {

        // Создаем массив согласно условия задания
        int[] array = {-5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10};

        // Выводим массив на экран
        System.out.print("Массив array = ");
        printArray(array);

        // Счетчик перестановок
        int count = 0;

        // Сортируем массив
        boolean needSort = true;// Переменная необходимости сортировки
        while (needSort) {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    needSort = true;
                }
            }
        }

        // Выводим массив на экран
        System.out.print("Отсортированный массив array = ");
        printArray(array);
        System.out.print("Количество перестановок = " + count);
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
Отсортированный массив array = -5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10, 
Количество перестановок = 0

 */