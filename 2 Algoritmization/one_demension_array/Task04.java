package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 4
 *	
 *		Даны действительные числа а1, а2, ..., аn. Поменять местами 
 *	наибольший и наименьший элемент
 *	
 */

public class Task04 {

	public  static void main(String[] args) {

        // Индексы максимального и минимального элементов в массиве (последовательности)
        int maxIndex = 0;
        int minIndex = 0;

        // Задаем размерность массива
        int n = 10;

        // Создаем массив
        double[] a = new double[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextDouble() * 10 - 5;
        }

        // Выводим полученный массив
        printArray(a);

        // Находим индексы максимального и минимального элементов массива
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        // Меняем полученные элементы местами
        double temp = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = temp;

        // Выводим измененный массив
        printArray(a);
    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f;  ", array[i]);
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

-3,62;  3,04;  4,14;  -1,24;  4,54;  -1,62;  0,58;  4,96;  0,04;  1,87;  
4,96;  3,04;  4,14;  -1,24;  4,54;  -1,62;  0,58;  -3,62;  0,04;  1,87;  

 */

