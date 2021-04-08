package by.jonline.basic.branching;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	���������
 *
 *   	������� 4
 *	
 *		��������� �������� ������� 
 *	F(x) = (x^2 - 3x +9, ���� x <= 3),(1 / (x^3 + 6), ���� x > 3)
 *	
 */

public class Task04 {
	
	public  static void main(String[] args) {

        //������ �������� �
        double x = 2;

        //�������� �������
        double fx;

        if (x > 3) {
        	fx = 1 / (Math.pow(x, 3) + 6);
        } else {
        	fx = x * x - 3 * x + 9;
        }

        System.out.println("��� � = " + x + ", F(x) = " + fx);
    }
}

/*
��������� ������ ���������:

��� � = 2.0, F(x) = 7.0

*/
