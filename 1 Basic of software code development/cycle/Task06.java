package by.jonline.basic.cycle;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	Циклы
 *
 *   	Задание 6
 *	
 *		Вывести на экран соответствия между символами и их численными
 * обозначениями в памяти компьютера
 */

public class Task06 {

	public static void main(String[] args) {

        //Результат выводим в виде таблицы 256х256
        for (int j = 0; j < 256; j++){
            int j256 = j * 256;
            for (int i = 0; i < 256; i++) {
                int ji = j256 + i;
                char c = (char) ji;
                System.out.print(c + " = " + ji + ";  ");
            }
            //переходим на следующую строчку таблицы
            System.out.println();
        }
    }
}

/*
   Результат работы программы:

Результат выполнения программы очень громоздкий, я не стал выводить 
его в тексте программы

 */
