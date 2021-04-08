package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 15
 *	
 *		Найти все натуральные n-значные числа, цифры в которых образуют 
 *	строго возрастающую последовательность (например, 1234, 5678). Для 
 *	решения задачи использовать декомпозицию
 *	
 */

public class Task15 {

	public static void main(String[] args) {

        // Введите разрядность числа от 1 до 9
        int n = 4;
        System.out.println("n = " + n);

        // Находим возрастающие последовательности чисел
        findIncreasingNumbers(n);
    }

    // Находим возрастающие последовательности чисел
    private static void findIncreasingNumbers(int n) {
        for (int j = 1; j <= 10 - n; j++) {
            int number = getIncreasingNumber(n, j);
            System.out.println(number);
        }
    }

    // Формируем возрастающее число
    private static int getIncreasingNumber(int n, int firstNumber) {
        int number = 0;
        for(int i = firstNumber; i < n + firstNumber; i++){
            number = number * 10 + i;
        }
        return number;
    }
}

/*
   Результат работы программы:

n = 4
1234
2345
3456
4567
5678
6789

 */