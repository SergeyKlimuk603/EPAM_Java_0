package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 14
 *	
 *		Натуральное число, в записи которого n цифр, называется числом
 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому
 * числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию
 *
 * Определение числа Армстронга в задании отличается от определение в 
 * Википедии, поэтому принимаем определение, данное в задании
 *	
 */

public class Task14 {

	public static void main(String[] args) {

        // Число k
        int k = 1000000;
        System.out.println("k = " + k);

        System.out.println("Числа Армстронга из диапазона от 1 до " + k);
        // Находим числа Армстронга и выводим их на консоль
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i))
                System.out.println(i);
        }
    }

    // Определяем является ли переданное число number числом Армстронга
    private static boolean isArmstrongNumber(int number) {
        int x = (int) Math.pow(getNumbersSum(number), getAmountNumbers(number));
        if (number == x)
            return true;
        return false;
    }

    // Определяем сумму цифр числа number
    private static int getNumbersSum(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        //System.out.println("sum = " + sum);
        return sum;
    }

    // Определяем количество цифр числа number
    private static int getAmountNumbers(int number) {
        int n = 0;
        while(number > 0) {
            number /= 10;
            n++;
        }
        //System.out.println("n = " + n);
        return n;
    }
}

/*
   Результат работы программы:

k = 1000000
Числа Армстронга из диапазона от 1 до 1000000
1
2
3
4
5
6
7
8
9
81
512
2401

 */