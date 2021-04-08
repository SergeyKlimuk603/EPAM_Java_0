package by.jonline.basic.cycle;

import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *		1. Basics of software code development
 * 
 *      �����
 *
 *      ������� 7
 * 
 *      ��� ������� ������������ ����� � ���������� �� m �� n ������� ���
 *  ��������, ����� ������� � ������ ����� m � n �������� � ����������
 */

public class Task07 {

	public static void main(String[] args) {

        int m = 0;
        int n = 0;

        //������� ������ Scanner ��� ����� � ����������
        Scanner sc = new Scanner(System.in);

        // ��������� ��� ��������� �������� �����
        // ����������� ���� ����� m
        System.out.print("������� ������ �������� ���������� m: ");
        while (sc.hasNextInt() == false) {
        	System.out.println("����� ������ �������� ��������, "
        						+ " � �� ������ ������!");
        	sc.nextLine();
        }
        m = sc.nextInt();

        // ����������� ���� ����� n
        while (true) {
            System.out.print("������� ������� �������� ���������� n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= m) {
                    System.out.println("����� ������ ����� ������� " + m);
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("����� ������ �������� ��������,"
                					+ " � �� ������ ������!");
                sc.nextLine();
            }
        }

        //�������� ���������������� ���� �� ����������� ���������� ���������
        System.out.println();

        //������� �������� ����������������� �����
        System.out.println("m = " + m + "; n = " + n);

        //��������� �������� ��� ���������� ����� ���������� � ������� �� � �������
        for (int i = m; i <= n; i++) {
            System.out.print("�������� ��� ����� " + i + ": ");
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    System.out.print(j + "; ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}

/*
��������� ������ ���������:

������� ������ �������� ���������� m: rgjnw
����� ������ �������� ��������,  � �� ������ ������!
5
������� ������� �������� ���������� n: 2
����� ������ ����� ������� 5
������� ������� �������� ���������� n: 12

m = 5; n = 12
�������� ��� ����� 5: 
�������� ��� ����� 6: 2; 3; 
�������� ��� ����� 7: 
�������� ��� ����� 8: 2; 4; 
�������� ��� ����� 9: 3; 
�������� ��� ����� 10: 2; 5; 
�������� ��� ����� 11: 
�������� ��� ����� 12: 2; 3; 4; 6; 

 */