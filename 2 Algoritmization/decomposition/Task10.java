package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 10
 *	
 *		���� ����������� ����� N. �������� ����� (������) ��� 
 *  ������������ �������, ���������� �������� �������� ����� ����� N.
 *	
 */

public class Task10 {

	public static void main(String[] args) {

        Random rand = new Random();

        // �������� ����������� �����
        long n = Math.abs(rand.nextLong());
        System.out.println("�������� �����\nN = " + n);

        // ������� �� ������� ����� � ���� �������
        System.out.println("�������� ����� � ���� ������� �����:");
        print(getArray(n));
    }

    // �������� ������
    private static int[] getArray(long n) {
        // ���������� ����������� �������
        int m = getArraySize(n);
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = (int) (n % 10);
            n /= 10;
        }
        return a;
    }

    // ���������� ���������� ���� � �����
    private static int getArraySize(long n) {
        int m = 1;
        while (n > 9) {
            n = n / 10;
            m++;
        }
        return m;
    }

    // ����� �� ������� ������� �����
    private static void print(int[] points) {
        for (int i = points.length - 1; i >= 0; i--) {
            System.out.print(points[i] + "; ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

�������� �����
N = 7545767953746554306
�������� ����� � ���� ������� �����:
7; 5; 4; 5; 7; 6; 7; 9; 5; 3; 7; 4; 6; 5; 5; 4; 3; 0; 6; 

 */