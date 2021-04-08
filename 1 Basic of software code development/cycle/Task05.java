package by.jonline.basic.cycle;

import java.math.BigInteger;


/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Циклы
 *
 *   	Задание 5
 *	
 *		Даны числовой ряд и некоторое число е. Найти сумму тех членов
 * ряда, модуль которых больше или равен заданному е. Общий член ряда
 * имеет вид: an = (1 / 2^n) + (1 / 3^n)
 */

public class Task05 {

	public  static void main(String[] args) {

        double e = 0.05;

        int n = 0;
        double a = 0;

        double sum = 0;

        while(true) {
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (a < e) {
               break;
            }
            sum += a;
            n++;
        }

        System.out.println("sum = " + sum);
    }
}

/*
   Результат работы программы:

sum = 3.431327160493827

 */
