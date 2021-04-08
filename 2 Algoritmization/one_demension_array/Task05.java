package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 5
 *	
 *		Даны целые числа а1, а2, ..., аn. Вывести на печать только те 
 *	числа, для которых ai > i.
 *	
 */

public class Task05 {

	public  static void main(String[] args) {

        // Задаем размерность массива
        int n = 10;

        // Создаем массив
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextInt(n);
        }

        // Проверяем условие ai > i
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.println("a[" + i + "] = " + a[i]);
            }
        }
    }
}

/*
   Результат работы программы:

a[0] = 4
a[1] = 4
a[2] = 5
a[3] = 7
a[5] = 9

 */

