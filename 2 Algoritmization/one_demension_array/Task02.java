package by.jonline.algoritmization.one_demension_array;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	Одномерные массивы
 *
 *   	Задание 2
 *	
 *		Дана последовательность действительных чисел а1, а2, ..., аn. 
 *	Заменить все ее члены, большие данного Z, этим числом. Подсчитать 
 *	количество замен.
 *	
 */

public class Task02 {

	public  static void main(String[] args) {

        //Задаем значения переменных
        double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
        				14, 15, 16, 17, 18, 19, 20};
        double z = 7.5;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > z){
                a[i] = z;
                count++;
            }
        }

        // Выводим результат
        for (double an : a) {
            System.out.print(an + ";  ");
        }
        System.out.println("\nКоличество замен = " + count);
    }
}

/*
   Результат работы программы:

1.0;  2.0;  3.0;  4.0;  5.0;  6.0;  7.0;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  7.5;  
Количество замен = 13


 */

