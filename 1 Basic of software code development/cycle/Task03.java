package by.jonline.basic.cycle;

import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�����
 *
 *   	������� 3
 *	
 *		����� ����� ��������� ������ ��� �����
 */

public class Task03 {

	public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("sum = " + sum);
    }
}

/*
   ��������� ������ ���������:

sum = 338350

 */
