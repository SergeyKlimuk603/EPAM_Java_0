package by.jonline.basic.cycle;

/**
 * @author Sergey Klimuk
 *
 *		1. Basics of software code development
 * 
 *      Циклы
 *
 *      Задание 8
 * 
 *     Даны два числа. Определить цифры, входящие в запись как первого
 *  так и второго числа
 */

public class Task08 {

	public static void main(String[] args) {

        //Сравниваемые числа
        int a = 234567;
        int b = 988776655;

        //Счетчик количества одинаковых цифр
        int count = 0;

        // Массив для хранения полученных одинаковых цифр
        char c[] = new char[10];

        //Преобразуем числа в строки
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);

        //Записываем в массив c[] одинаковые цифры для этого:
        // Перебираем каждый символ первого числа
        for (int i = 0; i < aString.length(); i++) {
            char c1 = aString.charAt(i);

            //индекс полученного числа для записи в массив
            int index = Character.getNumericValue(c1);

            //Сравниваем полученный символ с цифрами второго числа
            for (int j = 0; j < bString.length(); j++) {

                //если цифры равны, записываем полученное значение в массив по индексу цифры
                if (c1 == bString.charAt(j)) {
                    c[index] = c1;
                }
            }
        }

        System.out.println("Одинаковые цифры чисел " + "a = " + a 
        					+ " и b = " + b + ": ");

        //Выводим на экран полученные значения массива, которые соответствуют одинаковым цифрам чисел
        for (int i = 0; i < 10; i++) {
            if (c[i] != '\u0000') {
                System.out.print(c[i] + "; ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("числа не содержат одинаковых цифр");
        }
    }
}

/*
Результат работы программы:

Одинаковые цифры чисел a = 234567 и b = 988776655: 
5; 6; 7; 

 */
