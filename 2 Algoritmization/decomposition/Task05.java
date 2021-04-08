package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 5
 *	
 *		��������� ���������, ������� � ������� A[N] ������� ������ �� ��������
 *   ����� (������� �� ������ �����, ������� ������ ������������� ��������
 *   �������, �� ������ ���� ������ ���������).
 *	
 */

public class Task05 {

	public static void main(String[] args) {

        // �������� ������ �����
        int[] a = {0, 34, 91, -80, 3, -15, -23, 11, 61, 20, 13, 13, 5};

        // ������� ������ �� �����
        System.out.println("��� ������ �����:");
        print(a);
        System.out.println();

        // ������� ������ �� �������� �����
        int secondMax = getSecondMax(a);

        System.out.println("������ �� �������� ����� � �������: "
        					+ secondMax);
    }

    // ����� ���������� ������ �� �������� ����� � �������
    private static int getSecondMax(int[] a) {
        int max = a[0];
        int secondMax = a[0];
        for (int x : a) {
            if (max < x)
                max = x;
            if (secondMax < x && x < max)
                secondMax = x;
        }
        return secondMax;
    }

    // ����� �� ������� ������� �����
    private static void print(int[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + "; ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

��� ������ �����:
0; 34; 91; -80; 3; -15; -23; 11; 61; 20; 13; 13; 5; 

������ �� �������� ����� � �������: 61

 */