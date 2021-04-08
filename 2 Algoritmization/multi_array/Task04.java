package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 4
 *	
 *		Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 *                   1     2     3    ...   n
 *                   n    n-1   n-2   ...   1
 *                   1     2     3    ...   n
 *                   n    n-1   n-2   ...   1
 *                   ...  ...   ...   ...  ...
 *                   n    n-1   n-2   ...   1
 *	
 */

public class Task04 {

	public static void main(String[] args) {

        // Задаем размерность матрицы
        int n = 10;

        // Создаем заданную матрицу
        int[][] a = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (j % 2 == 0)
                    a[j][i] = i + 1;
                else
                    a[j][i] = n - i;
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
	1	2	3	4	5	6	7	8	9	10
	10	9	8	7	6	5	4	3	2	1
	1	2	3	4	5	6	7	8	9	10
	10	9	8	7	6	5	4	3	2	1
	1	2	3	4	5	6	7	8	9	10
	10	9	8	7	6	5	4	3	2	1
	1	2	3	4	5	6	7	8	9	10
	10	9	8	7	6	5	4	3	2	1
	1	2	3	4	5	6	7	8	9	10
	10	9	8	7	6	5	4	3	2	1  	

 */