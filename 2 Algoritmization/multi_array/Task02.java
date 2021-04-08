package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 2
 *	
 *		Дана квадратная матрица. Вывести на экран элементы, стоящие 
 *	на диагонали
 *	
 */

public class Task02 {

	public static void main(String[] args) {

        // Задаем размерность матрицы
        int n = 10;

        // Создаем массив
        int[][] a = createArray(n, n);

        // Выводим созданный массив в консоль
        System.out.print("Исходный массив: \n");
        printArray(a);

        // Выводим элементы матрицы стоящие на диагоналях
        System.out.print("Элементы стоящие по диагонали: \n");
        for (int j = 0, k = a[j].length - 1; j < a.length; j++, k--) {
            for (int i = 0; i < a[j].length; i++) {
                if (i == j || i == k) {
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
	7	3	0	0	5	0	1	0	9	8
	9	2	7	9	4	5	9	2	6	9
	3	3	0	7	3	5	4	2	2	1
	2	6	6	4	4	2	2	6	9	9
	3	0	2	6	0	6	7	7	1	8
	9	0	2	8	9	1	0	6	5	6
	6	7	6	6	3	1	5	4	5	7
	9	2	3	2	0	6	4	8	6	6
	0	5	6	9	6	7	1	0	4	8
	8	1	5	4	3	9	0	2	0	4

Элементы стоящие по диагонали: 
	7	  	  	  	  	  	  	  	  	8
	  	2	  	  	  	  	  	  	6	  
	  	  	0	  	  	  	  	2	  	  
	  	  	  	4	  	  	2	  	  	  
	  	  	  	  	0	6	  	  	  	  
	  	  	  	  	9	1	  	  	  	  
	  	  	  	6	  	  	5	  	  	  
	  	  	3	  	  	  	  	8	  	  
	  	5	  	  	  	  	  	  	4	  
	8	  	  	  	  	  	  	  	  	4

 */