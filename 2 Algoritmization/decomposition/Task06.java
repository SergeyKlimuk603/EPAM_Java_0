package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 6
 *	
 *		�������� ����� (������), �����������, �������� �� ������ ��� �����
 * ������� ��������
 *
 * �������:
 * ������� ������� ����� - ����� � ������� ��� = 1.
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        // �������� ������ �����
        int[] a = {5, 3, 9};

        String s = "�����: " + arrayToString(a);
        // ���������� �������� �� ����� � ������� ������� ��������
        if (!isSimple(a))
            s += " ��";
        s += " �������� ������� ��������";
        System.out.println(s);
    }

    // ����� ����������, �� ���, �������� �� ����� � ������� ������� ��������
    private static boolean isSimple(int[] array) {
        if (getArrayGcd(array) == 1)
            return true;
        return false;
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

    // ����� �� ������� ������� �����
    private static String arrayToString(int[] points) {
        String s = " ";
        for (int i = 0; i < points.length; i++) {
            s += points[i] + "; ";
        }
        return s;
    }
}

/*
   ��������� ������ ���������:

�����:  5; 3; 9;  �������� ������� ��������

������ �� �������� ����� � �������: 61

 */