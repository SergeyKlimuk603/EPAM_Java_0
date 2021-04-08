package by.jonline.algoritmization.multi_array;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Задачи. Массивы массивов
 *
 *   	Задание 8
 *	
 *		В числовой матрице поменять местами два столбца любых столбца,
 * т.е. все элементы одного столбца поставить на соответствующие им
 * позиции другого, а его элементы второго переместить в первый. Номера
 * столбцов вводит пользователь с клавиатуры.
 *	
 */

public class Task08 {

	public static void main(String[] args) {

        // Задаем размерность матрицы
        int m = 5; // число строк матрицы
        int n = 10; // число столбцов матрицы

        // Создаем матрицу
        int [][] a = createArray(m, n);

        // Выводим созданный массив в консоль
        System.out.print("Созданная матрица: \n");
        printArray(a);

        // Номера меняемых столбцов
        int x = 0;
        int y = 0;

        //Создаем объект Scanner для ввода с клавиатуры
        Scanner sc = new Scanner(System.in);

        // Запрашиваем ввод первого столбца x
        while (true) {
            System.out.print("Введите номер одного столбца (от 0 до " 
            				+ (n - 1) + "): ");
            if (sc.hasNextInt() && (x = sc.nextInt()) >= 0 && x < n) {
            	sc.nextLine();
                break;
            } else {
                System.out.println("Введенное значение некорректно!");
                sc.nextLine();
            }
        }

        // Запрашиваем ввод второго столбца y
        while (true) {
            System.out.print("Введите номер второго столбца (от 0 до " 
            				+ (n - 1) + "): ");
            if (sc.hasNextInt() && (y = sc.nextInt()) >= 0 && y < n) {
            	sc.nextLine();
                break;
            } else {
                System.out.println("Введенное значение некорректно!");
                sc.nextLine();
            }
        }
        sc.close();

        if (x != y) {
            for (int j = 0; j < a.length; j++) {
                int temp = a[j][x];
                a[j][x] = a[j][y];
                a[j][y] = temp;
            }
        }
        
        // Выводим полученный массив в консоль
        System.out.print("\nПоменяли столбцы: " + x + " и " + y + "\n");
        printArray(a);
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

Созданная матрица: 
	9	5	5	9	1	3	8	3	2	0
	9	8	9	4	1	6	4	4	1	9
	7	1	1	5	2	1	2	4	4	3
	7	7	4	5	5	1	8	8	9	1
	0	4	7	4	5	5	2	8	8	6

Введите номер одного столбца (от 0 до 9): werg
Введенное значение некорректно!
Введите номер одного столбца (от 0 до 9): 2
Введите номер второго столбца (от 0 до 9): 45
Введенное значение некорректно!
Введите номер второго столбца (от 0 до 9): 7

Поменяли столбцы: 2 и 7
	9	5	3	9	1	3	8	5	2	0
	9	8	4	4	1	6	4	9	1	9
	7	1	4	5	2	1	2	1	4	3
	7	7	8	5	5	1	8	4	9	1
	0	4	8	4	5	5	2	7	8	6

 */