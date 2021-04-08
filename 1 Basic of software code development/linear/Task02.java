package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Линейные программы
 *
 *   	Задание 2
 *	
 *		Вычислить значение выражения по формуле (все переменные принимают
 *	действительные значения):
 *		(b + sqrt(b^2 * 4 * a * c)) / (2 * a) - a^3 * c + b^-2
 *	
 */

public class Task02 {
	
	public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        //Вычисление сложного выражения разобъем на два этапа 
        double fraction = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);
        double z = fraction - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("z = " + z);
    }
}

/*
Результат работы программы:

z = -29.538107829530677

*/
