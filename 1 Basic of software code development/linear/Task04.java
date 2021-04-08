package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Линейные программы
 *
 *   	Задание 4
 *	
 *		Дано действительное число R вида nnn.ddd (три цифровых разряда в
 * дробной и целой частях). Поменять местами дробную и целую части числа
 * и вывести полученное значение числа.
 */

public class Task04 {
	public static void main(String[] args) {

        //Вводим число
        double number = 123.456;

        int left = (int) number;
        int right = ((int) (number * 1000)) % 1000;

        number = right + (double) left / 1000;

        System.out.println("new number = " + number);
    }
}

/*
Результат работы программы:

new number = 456.123

*/