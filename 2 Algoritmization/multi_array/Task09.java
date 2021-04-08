package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 9
 *	
 *		Задана матрица неотрицательных чисел. Посчитать сумму элементов
 * в каждом столбце. Определить, какой столбец содержит максимальную сумму.
 *	
 */

public class Task09 {

	public static void main(String[] args) {

        // Задаем размерность матрицы
        int m = 5; // число строк матрицы
        int n = 10; // число столбцов матрицы

        // Создаем матрицу
        int [][] a = createArray(m, n);

        // Выводим созданный массив в консоль
        System.out.print("Созданная матрица: \n");
        printArray(a);

        // Массив для хранения результатов сумм в каждом столбце
        int[] sumArray = new int[n];

        // Находим суммы элементов в каждом столбце и выводим их в консоль
        System.out.println("Суммы элементов в столбцах матрицы:");
        int min = 0; // индекс столбца с минимальной суммой элементов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArray[i] += a[j][i];
            }
            System.out.print("\t" + sumArray[i]);
            if (sumArray[min] > sumArray[i]) {
                min = i;
            }
        }

        // Выводим номер столбца с минимальным значением суммы элементов
        System.out.println("\nНомер столбца с минимальной суммой элементов (от 0) = " + min);
    }

    // Создание массива размерности m x n
    static int[][] createArray(int m, int n) {
        Random rand = new Random();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }
        return a;
    }

    // Вывод массива на консоль
    static  void printArray(int[][] array) {
        for (int[] line : array) {
            for (int n : line) {
                System.out.print("\t" + n);
            }
            System.out.println();
        }
    }
}

/*
   Результат работы программы:

Созданная матрица: 
	2	5	1	0	8	4	5	7	7	6
	9	8	6	4	2	2	2	4	0	1
	4	4	2	1	3	8	1	5	9	7
	1	7	7	3	9	7	1	0	2	2
	2	5	3	9	3	3	5	7	7	9
Суммы элементов в столбцах матрицы:
	18	29	19	17	25	24	14	23	25	25
Номер столбца с минимальной суммой элементов (от 0) = 6

 */