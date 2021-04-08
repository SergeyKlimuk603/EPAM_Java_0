package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Декомпозиция с использованием методов (подпрограммы)
 *
 *   	Задание 17
 *	
 *		Из заданного числа вычли сумму его цифр. Из результата вновь 
 *	вычли сумму его цифр и т.д. Сколько таких действий надо произвести, 
 *	чтобы получился нуль? Для решения задачи использовать декомпозицию
 *	
 */

public class Task17 {

	public static void main(String[] args) {

        // Заданное число
        int x = 5000;
        System.out.println("Заданные число:" + x);

        // Количество шагов (действий) необходимых для завершения задания
        int steps = getSteps(x);
        System.out.println("Для выполнения задания, при заданном числе: "
        					+ x + ", необходимо выполнить " + steps 
        					+ " действий.");
    }

	// Вычисляем необходимое количество шагов (действий)
    private static int getSteps(int x) {
        int steps = 0;
        while(x > 0) {
            x -= getNumbersSum(x);
            steps++;
        }
        return steps;
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
}

/*
   Результат работы программы:

Заданные число:5000
Для выполнения задания, при заданном числе: 5000, необходимо выполнить 354 действий.

 */