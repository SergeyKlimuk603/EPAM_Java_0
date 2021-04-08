package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 6
 *	
 *		Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 *                   1     1     1    ...   1     1     1
 *                   0     1     1    ...   1     1     0
 *                   0     0     1    ...   1     0     0
 *                  ...   ...   ...   ...  ...   ...   ...
 *                   0     1     1    ...   1     1     0
 *                   1     1     1    ...   1     1     1
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        // Задаем размерность матрицы
        int n = 10;

        // Создаем заданную матрицу
        int[][] a = new int[n][n];
        for (int j = 0; j < (n / 2 + n % 2); j++) { // (n / 2 + n % 2) - учитывает четные и нечетные матрицы
            for (int i = 0; i < n; i++) {
                if (i >= j && i < n - j) {
                    a[j][i] = 1;
                    a[n - 1 - j][i] = 1;
                }
                else {
                    a[j][i] = 0;
                    a[n - 1 - j][i] = 0;
                }
            }
        }

        // Выводим созданный массив в консоль
        System.out.print("Созданная матрица: \n");
        printArray(a);
    }

    // Вывод массива на консоль
    static  void printArray(int[][] array) {
        for (int[] line : array) {
            for (int n : line) {
                System.out.print("\t" + n);
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Созданная матрица: 
	1	1	1	1	1	1	1	1	1	1
	0	1	1	1	1	1	1	1	1	0
	0	0	1	1	1	1	1	1	0	0
	0	0	0	1	1	1	1	0	0	0
	0	0	0	0	1	1	0	0	0	0
	0	0	0	0	1	1	0	0	0	0
	0	0	0	1	1	1	1	0	0	0
	0	0	1	1	1	1	1	1	0	0
	0	1	1	1	1	1	1	1	1	0
	1	1	1	1	1	1	1	1	1	1

 */