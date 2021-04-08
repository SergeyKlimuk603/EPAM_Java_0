package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 16
 *	
 *		Написать программу, определяющую сумму n-значных чисел, содержащих
 * только нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
 * декомпозицию.
 *	
 */

public class Task16 {

	public static void main(String[] args) {

        // Массив заданных n-значных чисел содержащих только нечетные цифры
        int[] a = {13579, 97531, 11111, 33333, 55555, 77777, 99999};
        System.out.println("Заданные числа:");
        printArray(a);

        //Вычисляем сумму заданных чисел
        int sum = getSum(a);
        System.out.println("Сумма заданных чисел равна: " + sum);

        int amountEvenNumbers = getEvenNumbers(sum);
        System.out.println("Количество четных цифр в полученной сумме: "
        					+ amountEvenNumbers);
    }

	// Вычисляем сколько четных цифр в заданном числе
    private static int getEvenNumbers(int sum) {
        int amount = 0;
        while(sum > 0) {
            // выделяем младший разряд
            int x = sum % 10;
            // проверяем на четность
            if (x % 2 == 0) {
                amount++;
            }
            sum /= 10;
        }
        return amount;
    }

    // Вычисляем сумму чисел массива
    private static int getSum(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    // Выводим массив на экран
    private static void printArray(int[] a) {
        for (int x :a) {
            System.out.println(x);
        }
    }
}

/*
   Результат работы программы:

Заданные числа:
13579
97531
11111
33333
55555
77777
99999
Сумма заданных чисел равна: 388885
Количество четных цифр в полученной сумме: 4

 */