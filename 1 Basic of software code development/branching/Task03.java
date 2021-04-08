package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Ветвления
 *
 *   	Задание 3
 *	
 *		Даны три точки А(х1, у1), В(х2, у2), С(х3, у3). Определить,
 * будут ли они расположены на одной прямой
 *	
 */

public class Task03 {
	
	public  static void main(String[] args) {

		//Задаем коордитаты точек
	    int x1 = 1;
	    int y1 = 1;
	    int x2 = 2;
	    int y2 = 2;
	    int x3 = 3;
	    int y3 = 3;

	    if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
	        System.out.println("Точки лежат на одной прямой");
	    } else  {
	        System.out.println("Точки не лежат на одной прямой");
	    }
	}
}

/*
Результат работы программы:

Точки лежат на одной прямой

*/
