package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Ветвления
 *
 *   	Задание 2
 *	
 *		Необходимо найти max{min(a, b), min(c, d)}
 *	
 */

public class Task02 {
	
	public  static void main(String[] args) {

        //Задаем значения переменных
        int a = 4;
        int b = 8;
        int c = 3;
        int d = 5;

        //Результаты
        int min1;
        int min2;
        int max;

        min1 = (a < b) ? a : b;
        min2 = (c < d) ? c : d;
        max = (min1 > min2) ? min1 : min2;

        System.out.println("max = " + max);
    }
}

/*
Результат работы программы:

max = 4

*/
