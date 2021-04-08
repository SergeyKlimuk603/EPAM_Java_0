package by.jonline.basic.cycle;

import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�����
 *
 *   	������� 1
 *	
 *		�������� ���������, ��� ������������ ������ ����� ����� 
 *	������������� �����. � ��������� ��������� ��� ����� �� 1 �� 
 *	���������� ������������� �����
 */

public class Task01 {

	public static void main(String[] args) {

        int x = 0;
        int sum = 0;

        //������� ������ Scanner ��� ����� ������ � ����������
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� ����� ������������� �����: ");
            //���������, ��� ��������� �������� �������� ������ � ��� �������������
            if (sc.hasNextInt() && (x = sc.nextInt()) > 0) {
                break;
            } else {
                System.out.println("�������� ����, ���������� ��� ���.");
                sc.nextLine();
            }
        }

        //��������� ����� �����
        for (int i = 1; i <= x; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
        
        //����������� ������� Scanner
        sc.close();
    }
}

/*
   ��������� ������ ���������:

������� ����� ������������� �����: ���
�������� ����, ���������� ��� ���.
������� ����� ������������� �����: 5
sum = 15

 */
