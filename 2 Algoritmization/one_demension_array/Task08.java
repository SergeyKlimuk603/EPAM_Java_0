package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 8
 *	
 *		Дана последовательность целых чисел a1, a2, ..., an. Образовать
 *	новую последовательность, выбросив из исходной те члены, которые равны
 *	min(a1, a2, ..., an).
 *	
 */

public class Task08 {

	public static void main(String[] args) {

        // Задаем размерность массива
        int n = 20;

        // Создаем массив
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextInt(10);
        }

        // Выводим полученный массив в консоль
        printArray(a);

        // Определяем минимальное значение массива
        int amin = a[0];
        for (int an : a) {
            if (amin > an)
                amin = an;
        }

        // Получаем количество элементов amin в массиве
        int countMin = 0;
        for (int an : a) {
            if (an == amin)
                countMin++;
        }

        //Создаем новый массив с меньшим количеством элементов
        int[] aNew = new int[n - countMin];

        //Заполняем новый массив элементами из условия задачи
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > amin) {
                aNew[j] = a[i];
                j++;
            }
        }

        // Выводим новый массив в консоль
        printArray(aNew);
    }

    static  void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ";  ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

9;  2;  8;  3;  8;  1;  0;  3;  4;  6;  6;  4;  0;  8;  4;  4;  3;  0;  4;  9;  
9;  2;  8;  3;  8;  1;  3;  4;  6;  6;  4;  8;  4;  4;  3;  4;  9;  

 */

