package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы. Сортировка
 *
 *   	Задание 5. Сортировка вставками
 *	
 *		Дана последовательность чисел a1, a2, ..., an. Требуется 
 *	переставить числа в порядке возрастания. Делается это следующим 
 *	образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, 
 *	т.е. a1 <= a2 <= ... <= an. Берется следующее число a(i + 1) и 
 *  вставляется в последовательность так, чтобы новая последовательность
 *  была тоже вазрастающей. Процесс производится до тех пор, пока все 
 *  элементы от (i + 1) до n не буут перебраны.
 *  Примечание. Место помещения очередного элемента в отсотрированную 
 *  часть производить с помощью двоичного поиска. Двоичный поиск оформить
 *  в виде отдельной функции
 *	
 */

public class Task05 {

	static int[] array;

    public static void main(String[] args) {

        // Размерности массива
        int n = 10;

        // Создаем массив
        array = getArray(n);

        // Выводим массив на экран
        System.out.print("Заданная последовательность array:\n");
        printArray(array);

        // Сортируем заданную последовательность
        for (int i = 1; i < array.length; i++) {

            // Значение очередного сортируемого элемента
            int next = array[i];

            // Находим индекс слева, куда нужно вставить очередной элемент
            int index = binSearch(0, i - 1, next);

            // Сдвигаем отсортированную часть массива от index вправо
            for (int j = i; j > index; j--) {
                array[j] = array[j - 1];
            }

            // Помещаем в освободившуюся ячейку сортируемый элемент
            array[index] = next;
        }

        // Выводим массив на экран
        System.out.print("Отсортированная последовательность array:\n");
        printArray(array);
    }

    // Функция двоичного поиска (метод средней точки)
    static int binSearch(int leftIndex, int rightIndex, int element) {
        // Если в подмассиве осталась одна ячейка, значит element нужно
    	// вставить либо в эту ячейку либо в следующую (зависит от того,
    	// больше или меньше значение самой ячейки)
        if (leftIndex == rightIndex) {
            if (element < array[leftIndex]) {
                return leftIndex;
            } else {
                return ++leftIndex;
            }
        }
        // Находим среднюю ячейку массива. Если element меньше значения в
        // этой ячейки, то переходим в левую часть массива и продолжаем
        // поиск, в противном случае, продолжаем поиск в правой части
        int middle = (rightIndex - leftIndex) / 2 + leftIndex;
        if (element < array[middle]) {
            rightIndex = middle--;
        } else {
            leftIndex++;
        }
        return binSearch(leftIndex, rightIndex, element);
    }

    // Создание массива
    static int[] getArray(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(21) - 10;
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

/*
   Результат работы программы:

Заданная последовательность array:
-9, 0, 4, -2, 3, -8, 2, 2, 0, 3, 
Отсортированная последовательность array:
-9, -8, -2, 0, 0, 2, 2, 3, 3, 4, 

 */