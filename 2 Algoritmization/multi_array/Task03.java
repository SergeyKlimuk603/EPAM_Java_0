package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 3
 *	
 *		Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        // Задаем размерность массива
        int m = 5; // количество строк
        int n = 20; // количество столбцов

        // Задаем выводимую строку k и столбец p (нумерация начинается с нуля)
        int k = 2;
        int p = 7;

        // Создаем массив
        int[][] a = createArray(m, n);

        // Выводим созданный массив в консоль
        System.out.print("Исходный массив: \n");
        printArray(a);

        // Выводим k-ую строку и p-ый столбец матрицы
        System.out.print("Строка " + k + ", столбец " + p + ": \n");
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (i == p || j == k) {
                    System.out.print("\t" + a[j][i]);
                } else {
                    System.out.print("\t  ");
                }
            }
            System.out.println();
        }
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
        System.out.println();
    }
}

/*
   Результат работы программы:

Исходный массив: 
	8	8	1	2	4	5	4	3	0	2	9	9	0	5	8	7	8	4	2	5
	9	9	3	8	7	7	9	0	4	0	0	4	1	1	0	0	7	6	0	1
	8	1	5	9	8	5	5	9	1	5	8	1	4	4	7	2	1	9	5	7
	9	5	6	7	7	0	1	4	6	8	5	2	0	8	3	2	5	6	2	9
	2	2	9	0	2	9	6	4	8	8	0	1	5	5	7	3	0	9	9	0

Строка 2, столбец 7: 
	  	  	  	  	  	  	  	3	  	  	  	  	  	  	  	  	  	  	  	  
	  	  	  	  	  	  	  	0	  	  	  	  	  	  	  	  	  	  	  	  
	8	1	5	9	8	5	5	9	1	5	8	1	4	4	7	2	1	9	5	7
	  	  	  	  	  	  	  	4	  	  	  	  	  	  	  	  	  	  	  	  
	  	  	  	  	  	  	  	4	  	

 */