package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 1
 *	
 *		�������� ����� (������) ��� ���������� ����������� ������ ��������
 *	� ����������� ������ �������� ���� ����������� �����:
 *              ���(�, �) = (� * �) / ���(�, �)
 *	
 */

public class Task01 {

	public static void main(String[] args) {

        // �������� �����
        int a = 15;
        int b = 20;

        // ��������� ���
        int gcd = getGcd(a, b);
        // ��������� ���
        int lcm = getLsn(a, b);

        System.out.println("��� ����� " + a + " � " + b + " = " + gcd);
        System.out.println("��� ����� " + a + " � " + b + " = " + lcm);
    }

    // ���������� ���
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

    // ���������� ���
    private static int getLsn(int a, int b) {
        return a * b / getGcd(a, b);
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

��� ����� 15 � 20 = 5
��� ����� 15 � 20 = 60

 */