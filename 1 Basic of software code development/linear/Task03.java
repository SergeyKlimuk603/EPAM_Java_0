package by.jonline.basic.linear;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�������� ���������
 *
 *   	������� 3
 *	
 *		���������� ��������� �������� ��������� �� ������� (��� ����������
 * ��������� �������������� ��������): 
 * 			((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        double x = Math.toRadians(45);
        double y = Math.toRadians(60);
        
        //���������� �������� ��������� �������� �� ��� ����� 
        double nominator = Math.sin(x) + Math.cos(y);
        double denumerator = Math.cos(x) - Math.sin(y);
        double z = (nominator/denumerator) * Math.tan(x * y);

        System.out.println("z = " + z);
    }
}

/*
   ��������� ������ ���������:

z = -8.180842746014205

 */
