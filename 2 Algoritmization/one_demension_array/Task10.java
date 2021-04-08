package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 10
 *	
 *		Дан целочисленный массив с количеством элементов n. Сжать массив,
 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить
 * нулями). Примечание. Дополнительный массив не использовать
 *	
 */

public class Task10 {

	public static void main(String[] args) {

        // Задаем размерность массива
        int n = 20;

        // Создаем массив
        int[] a = createArray(n);

        // Выводим созданный массив в консоль
        System.out.print("Исходный массив: ");
        printArray(a);

        // Сжимаем массив
        int newLenth = (a.length - 1) / 2 + 1; // Определяем длинну сжатого массива
        for (int i = 1; i < newLenth; i++) {
            a[i] = a[2 * i];
        }

        // Заполняем освободившиеся элементы нулями
        for (int i = newLenth; i < a.length; i++) {
            a[i] = 0;
        }

        // Выводим сжатый массив в консоль
        System.out.print("Сжатый массив:   ");
        printArray(a);
    }

    // Создание массива размерности n
    static int[] createArray(int n) {
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10);
        }
        return a;
    }

    // Вывод массива на консоль
    static  void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ";  ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Исходный массив: 5;  4;  5;  6;  6;  0;  3;  1;  6;  2;  6;  2;  7;  8;  9;  3;  6;  1;  3;  7;  
Сжатый массив:   5;  5;  6;  3;  6;  6;  7;  9;  6;  3;  0;  0;  0;  0;  0;  0;  0;  0;  0;  0;  

 */

