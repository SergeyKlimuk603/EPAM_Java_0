package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Линейные программы
 *
 *   	Задание 5
 *	
 *		Дано натуральное число Т, которое представляет длительность
 * прошедшего времени в секундах. Вывести данное значение длительности
 * в часах, минутах, и секундах в следующей форме: ННч ММмин SSс.
 */

public class Task05 {
	
	public static void main(String[] args) {

        //Вводим время в секундах
        int time = 5000;

        //Вычисляем количество часов, минут и секунд
        int hour = time / 3600;
        int min = (time / 60) % 60;
        int sec = time % 60;

        //Выводим время в заданном формате
        System.out.printf("%02dч %02dмин %02dc", hour, min, sec);
    }
}

/*
Результат работы программы:

01ч 23мин 20c

*/
