package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Ветвления
 *
 *   	Задание 4
 *	
 *		Вычислить значение функции 
 *	F(x) = (x^2 - 3x +9, если x <= 3),(1 / (x^3 + 6), если x > 3)
 *	
 */

public class Task04 {
	
	public  static void main(String[] args) {

        //Вводим значение х
        double x = 2;

        //Значение функции
        double fx;

        if (x > 3) {
        	fx = 1 / (Math.pow(x, 3) + 6);
        } else {
        	fx = x * x - 3 * x + 9;
        }

        System.out.println("при х = " + x + ", F(x) = " + fx);
    }
}

/*
Результат работы программы:

при х = 2.0, F(x) = 7.0

*/
