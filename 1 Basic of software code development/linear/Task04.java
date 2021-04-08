package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�������� ���������
 *
 *   	������� 4
 *	
 *		���� �������������� ����� R ���� nnn.ddd (��� �������� ������� �
 * ������� � ����� ������). �������� ������� ������� � ����� ����� �����
 * � ������� ���������� �������� �����.
 */

public class Task04 {
	public static void main(String[] args) {

        //������ �����
        double number = 123.456;

        int left = (int) number;
        int right = ((int) (number * 1000)) % 1000;

        number = right + (double) left / 1000;

        System.out.println("new number = " + number);
    }
}

/*
��������� ������ ���������:

new number = 456.123

*/