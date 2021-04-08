package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Линейные программы
 *
 *   	Задание 6
 *	
 *		Для данной области составить линейную программу, которая печатает
 * true, если точка с координатами (x, y) принадлежит закрашенной области,
 * и false - в противном случае. (извините, картинку не смог вставить в
 * код...)
 */

public class Task06 {
	
	public static void main(String[] args) {

        //Вводим координаты точки
        int x = 3;
        int y = 2;

        //Результат проверки
        boolean z = false;

        //проверяем принадлежит ли точка заданной области
        if(y <= 4 && y >= 0 && x <= 2 && x >= -2 ||
                y <= 0 && y >= -3 && x >= -4 && x <= 4) {
            z = true;
        }

        System.out.println(z);
    }
}

/*
Результат работы программы:

false

*/
