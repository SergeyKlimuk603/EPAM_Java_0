package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	���������
 *
 *   	������� 1
 *	
 *		���� ��� ���� ������������ (� ��������). ����������, ����������
 * �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
 */

public class Task01 {

	public static void main(String[] args) {

        //������ �������� �����
        int x = 45;
        int y = 60;

        if (x + y >= 180) {
            System.out.println("������������ � ������ " + x 
            					+ " � " + y + " - �� ����������");
        } else if ((x + y) == 90) {
            System.out.println("����������� � ������ " + x 
            					+ " � " + y + " - �������������");
        } else {
            System.out.println("����������� � ������ " + x 
            					+ " � " + y + " - ����������");
        }
    }
}

/*
   ��������� ������ ���������:

����������� � ������ 45 � 60 - ����������

 */
