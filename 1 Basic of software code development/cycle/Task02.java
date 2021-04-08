package by.jonline.basic.cycle;

import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Циклы
 *
 *   	Задание 2
 *	
 *		Вычислить значения функции на отрезке [a, b] с шагом h: 
 *				(y = x, при х > 2), (y = -x, при x <= 2)
 */

public class Task02 {

	public static void main(String[] args) {

        //Входные данные
        double a = -8;
        double b = 10;
        double h = 1.5;

        double x = a;
        double y;

        while(x <= b) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x = " + x + ",\t y = " + y);
            x += h;
        }
    }
}

/*
   Результат работы программы:

x = -8.0,	 y = 8.0
x = -6.5,	 y = 6.5
x = -5.0,	 y = 5.0
x = -3.5,	 y = 3.5
x = -2.0,	 y = 2.0
x = -0.5,	 y = 0.5
x = 1.0,	 y = -1.0
x = 2.5,	 y = 2.5
x = 4.0,	 y = 4.0
x = 5.5,	 y = 5.5
x = 7.0,	 y = 7.0
x = 8.5,	 y = 8.5
x = 10.0,	 y = 10.0

 */
