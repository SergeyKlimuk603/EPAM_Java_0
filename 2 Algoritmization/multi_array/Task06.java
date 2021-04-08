package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 6
 *	
 *		������������ ���������� ������� ������� n �� ��������� ������� (n - ������)
 *                   1     1     1    ...   1     1     1
 *                   0     1     1    ...   1     1     0
 *                   0     0     1    ...   1     0     0
 *                  ...   ...   ...   ...  ...   ...   ...
 *                   0     1     1    ...   1     1     0
 *                   1     1     1    ...   1     1     1
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int n = 10;

        // ������� �������� �������
        int[][] a = new int[n][n];
        for (int j = 0; j < (n / 2 + n % 2); j++) { // (n / 2 + n % 2) - ��������� ������ � �������� �������
            for (int i = 0; i < n; i++) {
                if (i >= j && i < n - j) {
                    a[j][i] = 1;
                    a[n - 1 - j][i] = 1;
                }
                else {
                    a[j][i] = 0;
                    a[n - 1 - j][i] = 0;
                }
            }
        }

        // ������� ��������� ������ � �������
        System.out.print("��������� �������: \n");
        printArray(a);
    }

    // ����� ������� �� �������
    static  void printArray(int[][] array) {
        for (int[] line : array) {
            for (int n : line) {
                System.out.print("\t" + n);
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

��������� �������: 
	1	1	1	1	1	1	1	1	1	1
	0	1	1	1	1	1	1	1	1	0
	0	0	1	1	1	1	1	1	0	0
	0	0	0	1	1	1	1	0	0	0
	0	0	0	0	1	1	0	0	0	0
	0	0	0	0	1	1	0	0	0	0
	0	0	0	1	1	1	1	0	0	0
	0	0	1	1	1	1	1	1	0	0
	0	1	1	1	1	1	1	1	1	0
	1	1	1	1	1	1	1	1	1	1

 */