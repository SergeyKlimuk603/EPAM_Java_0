package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 9
 *	
 *		� ������� ����� ����� � ����������� ��������� n ����� �������� 
 *	����� ������������� �����. ���� ����� ��������� ���������, �� ����������
 *	���������� �� ���.
 *	
 */

public class Task09 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int n = 20;

        // ������� ������
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextInt(10);
        }

        // ������� ��������� ������ � �������
        printArray(a);

        int value = 0; //�������� ���������� ���������
        int count = 1; //���������� ���������� ���������

        // ���������� ��� (����� ����������) �������� �������
        for (int i = 0; i < a.length - 1; i++) {
            int countNew = 1; // ���������� ������ ��������

            // ������ ����������� ������� � ������� ���������� � �������
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    countNew++;
                }
            }

            // ���������� ��������� ��� ������ �������� ������� � ����������� ��� ��� ���������� ����������� ��������
            if (countNew > count) {
                count = countNew;
                value = a[i];
            } else if (countNew == count && value > a[i]) {
                value = a[i];
            }
        }

        System.out.println("�����������, �������� �����-������������� ������� = " + value +
                "; ���������� ����� ��������� = " + count);

    }

    static  void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ";  ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

3;  1;  9;  2;  0;  1;  2;  1;  1;  6;  8;  8;  4;  7;  8;  3;  8;  6;  6;  9;  
�����������, �������� �����-������������� ������� = 1; ���������� ����� ��������� = 4

 */

