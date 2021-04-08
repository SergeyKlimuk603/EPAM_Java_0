package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�������� ���������
 *
 *   	������� 5
 *	
 *		���� ����������� ����� �, ������� ������������ ������������
 * ���������� ������� � ��������. ������� ������ �������� ������������
 * � �����, �������, � �������� � ��������� �����: ��� ����� SS�.
 */

public class Task05 {
	
	public static void main(String[] args) {

        //������ ����� � ��������
        int time = 5000;

        //��������� ���������� �����, ����� � ������
        int hour = time / 3600;
        int min = (time / 60) % 60;
        int sec = time % 60;

        //������� ����� � �������� �������
        System.out.printf("%02d� %02d��� %02dc", hour, min, sec);
    }
}

/*
��������� ������ ���������:

01� 23��� 20c

*/
