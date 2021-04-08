package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 8
 *	
 *		���� ������������������ ����� ����� a1, a2, ..., an. ����������
 *	����� ������������������, �������� �� �������� �� �����, ������� �����
 *	min(a1, a2, ..., an).
 *	
 */

public class Task08 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int n = 20;

        // ������� ������
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextInt(10);
        }

        // ������� ���������� ������ � �������
        printArray(a);

        // ���������� ����������� �������� �������
        int amin = a[0];
        for (int an : a) {
            if (amin > an)
                amin = an;
        }

        // �������� ���������� ��������� amin � �������
        int countMin = 0;
        for (int an : a) {
            if (an == amin)
                countMin++;
        }

        //������� ����� ������ � ������� ����������� ���������
        int[] aNew = new int[n - countMin];

        //��������� ����� ������ ���������� �� ������� ������
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > amin) {
                aNew[j] = a[i];
                j++;
            }
        }

        // ������� ����� ������ � �������
        printArray(aNew);
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

9;  2;  8;  3;  8;  1;  0;  3;  4;  6;  6;  4;  0;  8;  4;  4;  3;  0;  4;  9;  
9;  2;  8;  3;  8;  1;  3;  4;  6;  6;  4;  8;  4;  4;  3;  4;  9;  

 */

