package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 9
 *	
 *		В массиве целых чисел с количеством элементов n найти наиболее 
 *	часто встречающееся число. Если таких элементов несколько, то определить
 *	наименьшее из них.
 *	
 */

public class Task09 {

	public static void main(String[] args) {

        // Задаем размерность массива
        int n = 20;

        // Создаем массив
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextInt(10);
        }

        // Выводим созданный массив в консоль
        printArray(a);

        int value = 0; //значение одинаковых элементов
        int count = 1; //количество одинаковых элементов

        // Перебираем все (кроме последнего) элементы массива
        for (int i = 0; i < a.length - 1; i++) {
            int countNew = 1; // количество нового элемента

            // Каждый последующий элемент в массиве сравниваем с текущим
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    countNew++;
                }
            }

            // Сравниваем результат для нового элемента массива с результатом для уже найденного подходящего элемента
            if (countNew > count) {
                count = countNew;
                value = a[i];
            } else if (countNew == count && value > a[i]) {
                value = a[i];
            }
        }

        System.out.println("Минимальный, наиболее часто-повторяющийся элемент = " + value +
                "; количество таких элементов = " + count);

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

3;  1;  9;  2;  0;  1;  2;  1;  1;  6;  8;  8;  4;  7;  8;  3;  8;  6;  6;  9;  
Минимальный, наиболее часто-повторяющийся элемент = 1; количество таких элементов = 4

 */

