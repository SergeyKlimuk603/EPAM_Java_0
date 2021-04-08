package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 13
 *	
 *		Два простых числа называются "близнецами", если они отличаются
 * друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары 
 * "близнецов" из отрезка [n, 2n], где n - заданное натуральное число 
 * больше 2. Для решения задачи использовать декомпозицию.
 *	
 */

public class Task13 {

	public static void main(String[] args) {

        // Число n
        int n = 7;
        System.out.println("n = " + n);

        // Создаем массив чисел
        int[] a = getArray(n);

        // Выводим на коноль полученный массив чисел
        print(a);

        // Выводим пары близнецов из заданного отрезка
        printTwinks(a);
    }

    private static void printTwinks(int[] a) {
        System.out.println("Пары близнецов:");
        for (int i = 0; i < a.length - 2; i++) {
            System.out.println(a[i] + " : " + a[i+2]);
        }
    }

    private static int[] getArray(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = n + i;
        }
        return array;
    }

    private static void print(int[] a) {
        System.out.println("Массив полученных чисел:");
        for (int x : a) {
            System.out.print(x + "; ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

n = 7
Массив полученных чисел:
7; 8; 9; 10; 11; 12; 13; 14; 
Пары близнецов:
7 : 9
8 : 10
9 : 11
10 : 12
11 : 13
12 : 14

 */