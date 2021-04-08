package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 6
 *	
 *		Задана последовательность N вещественных чисел. Вычислить сумму 
 *	чисел, порядковые номера которых являются простыми числами
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        double sum = 0;

        // Задаем размерность массива
        int n = 10;

        // Создаем массив
        double[] a = new double[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextDouble() * 10 - 5;
        }

        // Перебираем элементы массива
        for (int i = 2; i < a.length; i++) {

            // Проверяем, является ли индекс массива простым числом
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }

            // Если индекс является простым числом, суммируем и выводим значение элемента в консоль
            if (simple) {
                sum += a[i];
                System.out.println("a[" + i + "] = " + a[i]);
            }
        }

        System.out.println();
        System.out.println("sum = " + sum);
    }
}

/*
   Результат работы программы:

a[2] = 1.0964276656488048
a[3] = 1.7081697996169263
a[5] = 0.32660095981123494
a[7] = -2.5566334027622215

sum = 0.5745650223147445

 */

