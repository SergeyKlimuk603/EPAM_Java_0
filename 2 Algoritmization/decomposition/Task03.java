package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 3
 *	
 *		��������� ������� ����������� �������������� �� �������� a,
 *	 ��������� ����� ���������� ������� ������������
 *
 *   �������:
 *   ���������� ������������� ������� �� ����� �������������� 
 *   �������������. ������� ��������������� ������������ �� �������� "a" 
 *   ����������� �� �������:
 *              S = a^2 * sqrt(3) / 4
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        // ������� ����������� ��������������
        double a = 5;

        // ������� ����������� ��������������
        double s = 6 * regularTriangleArea(a);

        System.out.print("S = " + s);
    }

    private static double regularTriangleArea(double a) {
        return a * a * Math.sqrt(3) / 4;
    }
}

/*
   ��������� ������ ���������:

S = 64.9519052838329

 */