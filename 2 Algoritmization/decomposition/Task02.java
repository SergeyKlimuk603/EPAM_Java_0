package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 2
 *	
 *		�������� ����� (������) ��� ���������� ����������� ������ ��������
 *   ������� ����������� �����.
 *
 *   �������:
 *   ������� ��� ������ ���� �����, ����� ������� ��� ���� �� ������ ���
 *   ����������� ��� � ���������� ����� � �.�.
 *   ���(a1, a2)=d2, ���(d2, a3)=d3, ���(d3, a4)=d4, �, ���(dk-1, ak)=dk.
 *	
 */

public class Task02 {

	public static void main(String[] args) {

        // �������� ����� ���������� � ���� �������
        int[] a = {56, 28, 168, 7};

        // ��� �������
        int gcd = getArrayGcd(a);

        // ������� ��������� �� �����
        System.out.print("��� ����� ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("=  " + gcd);
    }

    // ���������� ��� ������� �����
    private static int getArrayGcd(int[] array) {
        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = getGcd(gcd, array[i]);
        }
        return gcd;
    }

    // ���������� ��� ���� �����
    private static int getGcd(int a, int b) {
        // ������� ������ ��������� ���������� (��� ����� ������� ������
        // ����� ������� � ��������� ������)
        int[] s = {a, b};

        if (s[1] > s[0])
            swap(s);
        while (s[1] > 0) {
            s[0] %= s[1];
            swap(s);
        }
        return s[0];
    }

    // ������ ����� �������
    private static int[] swap(int[] s) {
        int temp = s[0];
        s[0] = s[1];
        s[1] = temp;
        return s;
    }
}

/*
   ��������� ������ ���������:

��� ����� 56, 28, 168, 7, =  7

 */