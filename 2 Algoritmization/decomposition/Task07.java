package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 7
 *	
 *		Написать метод (методы) для вычисления суммы факториалов всех
 * нечетных чисел от 1 до 9
 *	
 */

public class Task07 {

	public static void main(String[] args) {

        int n = 9;

        // Вычисляем сумму факториалов нечетных чисел от 1 до n
        System.out.println("Сумма факториалов нечетных чисел от 1 до " + n
                + " равна " + getFactorialSum(n));

    }

    // Вычисление произведения факториалов нечетных чисел
    private static int getFactorialSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += getFactorial(i);
        }
        return sum;
    }

    // Вычисление факториала числа
    private static int getFactorial(int n) {
       if (n > 1) {
           n = n * getFactorial(n - 1);
       }
        return n;
    }
}

/*
   Результат работы программы:

Сумма факториалов нечетных чисел от 1 до 9 равна 368047

 */