package by.jonline.basic.cycle;

import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Циклы
 *
 *   	Задание 1
 *	
 *		Напишите программу, где пользователь вводит любое целое 
 *	положительное число. А программа суммирует все числа от 1 до 
 *	введенного пользователем числа
 */

public class Task01 {

	public static void main(String[] args) {

        int x = 0;
        int sum = 0;

        //Создаем объект Scanner для ввода данных с клавиатуры
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите целое положительное число: ");
            //Проверяем, что введенное значение является числом и оно положительное
            if (sc.hasNextInt() && (x = sc.nextInt()) > 0) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте еще раз.");
                sc.nextLine();
            }
        }

        //Вычисляем сумму чисел
        for (int i = 1; i <= x; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
        
        //Освобождаем ресурсы Scanner
        sc.close();
    }
}

/*
   Результат работы программы:

Введите целое положительное число: ывп
Неверный ввод, попробуйте еще раз.
Введите целое положительное число: 5
sum = 15

 */
