package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�������� ���������
 *
 *   	������� 6
 *	
 *		��� ������ ������� ��������� �������� ���������, ������� ��������
 * true, ���� ����� � ������������ (x, y) ����������� ����������� �������,
 * � false - � ��������� ������. (��������, �������� �� ���� �������� �
 * ���...)
 */

public class Task06 {
	
	public static void main(String[] args) {

        //������ ���������� �����
        int x = 3;
        int y = 2;

        //��������� ��������
        boolean z = false;

        //��������� ����������� �� ����� �������� �������
        if(y <= 4 && y >= 0 && x <= 2 && x >= -2 ||
                y <= 0 && y >= -3 && x >= -4 && x <= 4) {
            z = true;
        }

        System.out.println(z);
    }
}

/*
��������� ������ ���������:

false

*/
