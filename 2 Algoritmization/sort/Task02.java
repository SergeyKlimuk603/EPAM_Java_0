package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 2
 *	
 *		Даны две последовательности: 
 *	a1 <= a2 <= ... <= an   и   b1 <= b2 <= ... <= bm.
 *  Образовать из них новую последовательность чисел так, чтобы она 
 *  тоже была неубывающей.
 *  Примечание. Дополнительный массив не использовать.
 *	
 */

public class Task02 {

	public static void main(String[] args) {

        // Создаем массивы
        int[] array1 = {-5, 1, 1, 3, 5, 5, 6, 9, 11, 15, 16, 16};
        int[] array2 = {-3, -3, 0, 2, 4, 4, 7, 10};

        System.out.print("array1: ");
        printArray(array1);
        System.out.print("array2: ");
        printArray(array2);

        // Формируем новую последовательность
        System.out.print("Полученная последовательность: ");
        int i = 0;
        int j = 0;
        while(true) {
            // Если элементы одного из массивов закончились, выводим оставшиеся элементы второго
            if (i == array1.length) {
                for (; j < array2.length; j++) {
                    System.out.print(array2[j] + "  ");
                }
                break;
            }
            if (j == array2.length) {
                for (; i < array1.length; i++) {
                    System.out.print(array1[i] + "  ");
                }
                break;
            }
            // Находим наименьший элемент и выводим его в общую последовательность
            if (array1[i] > array2[j]) {
                System.out.print(array2[j] + "  ");
                j++;
            } else {
                System.out.print(array1[i] + "  ");
                i++;
            }
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

array1: -5  1  1  3  5  5  6  9  11  15  16  16  
array2: -3  -3  0  2  4  4  7  10  
Полученная последовательность: -5  -3  -3  0  1  1  2  3  4  4  5  5  6  7  9  10  11  15  16  16 

 */