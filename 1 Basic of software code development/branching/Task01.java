package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Ветвления
 *
 *   	Задание 1
 *	
 *		Даны два угла треугольника (в градусах). Определить, существует
 * ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task01 {

	public static void main(String[] args) {

        //Вводим значения углов
        int x = 45;
        int y = 60;

        if (x + y >= 180) {
            System.out.println("Треугольника с углами " + x 
            					+ " и " + y + " - не существует");
        } else if ((x + y) == 90) {
            System.out.println("Треугольник с углами " + x 
            					+ " и " + y + " - прямоугольный");
        } else {
            System.out.println("Треугольник с углами " + x 
            					+ " и " + y + " - существует");
        }
    }
}

/*
   Результат работы программы:

Треугольник с углами 45 и 60 - существует

 */
