package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 8
 *	
 *		Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). 
 *	Составить программу, которая приводит эти дроби к общему знаменателю
 *	и упорядочивает их в порядке возрастания.
 *
 *  Решение:
 *  Создадим два массива 'p' и 'q'. Массив 'p' содержит все числители 
 *  дробей, 'q' - все знаменатели. Затем для массива 'q' находим НОК, 
 *  пересчитываем под новый знаменатель и сортируем значения 'p'. Новые
 *  полученные дроби будут состоять из новых элементов 'p' деленных на НОК.
 */

public class Task08 {

	// Вспомогательные переменные для нахождения НОД
    static long a;
    static long b;

    public static void main(String[] args) {

        // Размерности массива
        int n = 10;

        // Модуль диапазона значений
        int rangeP = 100; //числителей
        int rangeQ = 10; //знаменателей

        // Создаем массив числителей дроби 'p'
        long[] arrayP = getArray(n, false, rangeP);
        // Создаем массив знаменателей дроби 'q'
        long[] arrayQ = getArray(n, true, rangeQ);

        // Выводим полученные дроби на экран
        System.out.print("Заданные дроби:\n");
        printArray(arrayP, arrayQ);

        // НОД для 'q'
        long gcd = arrayQ[0];
        // НОК для 'q'
        long lcm = arrayQ[0];

        // Находим НОК для 'q'
        for (int k = 1; k < arrayQ.length; k++) {
            // Принимаем a равным НОК всех элементов 'q' от q0 до q(k - 1)
            a = lcm;
            b = arrayQ[k];
            if (a < b) swap();
            // Находим НОД для a и b
            while (b > 0) {
                a %= b;
                swap();
            }
            gcd = a;
            // Находим НОК для элементов от q0 до qk
            lcm = lcm / gcd * arrayQ[k];
        }
        // В конце цикла получаем НОК для всех элементов 'q'
        System.out.println("НОК для всех знаменателей 'q' = " + lcm);

        //Находим значения числителей дробей приведенных к общему знаменателю
        for (int k = 0; k < arrayP.length; k++) {
            arrayP[k] *= lcm / arrayQ[k];
            arrayQ[k] = lcm;
        }

        //Учитывая, что все дроби мы привели к общему знаменателю, мы можем
        //отсортировать дроби лишь по значению их числителей
        sort(arrayP);
        
        // Выводим массив на экран
        System.out.print("Отсортированные, приведенные к общему "
        					+ "знаменателю дроби:\n");
        printArray(arrayP, arrayQ);
    }

    static void swap() {
        long temp = a;
        a = b;
        b = temp;
    }
    
    // Сортировка массива методом перестановок (пузырьковая)
    static void sort(long[] array) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    long temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    needSort = true;
                }
            }
        }
    }

    // Создание массива чисел
    // Если это массив знаменателей, то он может содержать только положительные числа
    // т.к. знак дроби будет указываться в числителе
    static long[] getArray(int n, boolean onlyPositive, int range) {
        Random rand = new Random();
        long[] array = new long[n];
        int negativeRange = range;
        if (onlyPositive) negativeRange = 0;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(range + negativeRange) - negativeRange;
            // Проверяем, чтобы знаменатель не был равен нулю
            if (onlyPositive && array[i] == 0) array[i] = 1;
        }
        return array;
    }

    static void printArray(long[] array1, long[] array2) {
        for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "/" + array2[i] + ";  ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Заданные дроби:
39/1;  79/8;  8/3;  -11/8;  39/4;  81/9;  52/6;  -93/4;  -32/6;  -4/3;  
НОК для всех знаменателей 'q' = 72
Отсортированные, приведенные к общему знаменателю дроби:
-1674/72;  -384/72;  -99/72;  -96/72;  192/72;  624/72;  648/72;  702/72;  711/72;  2808/72;  

 */