package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	���������
 *
 *   	������� 3
 *	
 *		���� ��� ����� �(�1, �1), �(�2, �2), �(�3, �3). ����������,
 * ����� �� ��� ����������� �� ����� ������
 *	
 */

public class Task03 {
	
	public  static void main(String[] args) {

		//������ ���������� �����
	    int x1 = 1;
	    int y1 = 1;
	    int x2 = 2;
	    int y2 = 2;
	    int x3 = 3;
	    int y3 = 3;

	    if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
	        System.out.println("����� ����� �� ����� ������");
	    } else  {
	        System.out.println("����� �� ����� �� ����� ������");
	    }
	}
}

/*
��������� ������ ���������:

����� ����� �� ����� ������

*/
