package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Линейные программы
 *
 *   	Задание 3
 *	
 *		Необходимо вычислить значение выражения по формуле (все переменные
 * принимают действительные значения): 
 * 			((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        double x = Math.toRadians(45);
        double y = Math.toRadians(60);
        
        //Вычисление сложного выражения разобъем на два этапа 
        double nominator = Math.sin(x) + Math.cos(y);
        double denumerator = Math.cos(x) - Math.sin(y);
        double z = (nominator/denumerator) * Math.tan(x * y);

        System.out.println("z = " + z);
    }
}

/*
   Результат работы программы:

z = -8.180842746014205

 */
