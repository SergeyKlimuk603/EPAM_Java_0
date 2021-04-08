package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 10
 *	
 *		��� ������������� ������ � ����������� ��������� n. ����� ������,
 * �������� �� ���� ������ ������ ������� (�������������� �������� ���������
 * ������). ����������. �������������� ������ �� ������������
 *	
 */

public class Task10 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int n = 20;

        // ������� ������
        int[] a = createArray(n);

        // ������� ��������� ������ � �������
        System.out.print("�������� ������: ");
        printArray(a);

        // ������� ������
        int newLenth = (a.length - 1) / 2 + 1; // ���������� ������ ������� �������
        for (int i = 1; i < newLenth; i++) {
            a[i] = a[2 * i];
        }

        // ��������� �������������� �������� ������
        for (int i = newLenth; i < a.length; i++) {
            a[i] = 0;
        }

        // ������� ������ ������ � �������
        System.out.print("������ ������:   ");
        printArray(a);
    }

    // �������� ������� ����������� n
    static int[] createArray(int n) {
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10);
        }
        return a;
    }

    // ����� ������� �� �������
    static  void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ";  ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

�������� ������: 5;  4;  5;  6;  6;  0;  3;  1;  6;  2;  6;  2;  7;  8;  9;  3;  6;  1;  3;  7;  
������ ������:   5;  5;  6;  3;  6;  6;  7;  9;  6;  3;  0;  0;  0;  0;  0;  0;  0;  0;  0;  0;  

 */

