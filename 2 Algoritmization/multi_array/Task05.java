package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 5
 *	
 *		Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 *                     1     1     1    ...   1     1     1
 *                     2     2     2    ...   2     2     0
 *                     3     3     3    ...   3     0     0
 *                    ...  ...   ...   ...  ...   ...   ...
 *                    n-1   n-1    0    ...   0     0     0
 *                     n     0     0    ...   0     0     0
 *	
 */

public class Task05 {

	public static void main(String[] args) {

        // Задаем размерность матрицы
        int n = 10;

        // Создаем заданную матрицу
        int[][] a = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (i < n - j )
                    a[j][i] = j + 1;
                else
                    a[j][i] = 0;
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
	2	2	2	2	2	2	2	2	2	0
	3	3	3	3	3	3	3	3	0	0
	4	4	4	4	4	4	4	0	0	0
	5	5	5	5	5	5	0	0	0	0
	6	6	6	6	6	0	0	0	0	0
	7	7	7	7	0	0	0	0	0	0
	8	8	8	0	0	0	0	0	0	0
	9	9	0	0	0	0	0	0	0	0
	10	0	0	0	0	0	0	0	0	0

 */