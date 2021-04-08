package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 15
 *	
 *		������� ���������� ������� ������� � �������� ��� ��������
 * �������� �� ����
 *	
 */

public class Task15 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int m = 10;// ���������� �����
        int n = 10;// ���������� ��������

        // ������� �������
        int [][] a = createArray(m, n);

        // ������� ��������� ������ � �������
        System.out.print("��������� �������: \n");
        printArray(a);

        // ������� ���������� ������� �������
        int max = a[0][0];
        for (int[] line : a) {
            for (int ai : line) {
                if (max < ai)
                    max = ai;
            }
        }
        
        // �������� �������� �������� ������� �� ����������
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (a[j][i] % 2 != 0)
                    a[j][i] = max;
            }
        }

        // ������� ���������� ������ � �������
        System.out.print("���������� �������: \n");
        printArray(a);
    }

    // �������� ������� ����������� m x n
    static int[][] createArray(int m, int n) {
        Random rand = new Random();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(20) - 10;
            }
        }
        return a;
    }

    // ����� ������� �� �������
    static  void printArray(int[][] array) {
        for (int[] line : array) {
            for (int n : line) {
                if (n >= 0)
                    System.out.print("\t " + n);
                else
                    System.out.print("\t" + n);
            }
            System.out.println();
        }
    }
}

/*
   ��������� ������ ���������:

��������� �������: 
	-5	 1	-2	 6	-4	-8	-1	-1	 5	 7
	-8	-1	-2	 7	 6	 0	-2	-10	 5	-3
	-9	-2	-1	 7	-5	-2	 2	-9	-6	-2
	 0	-4	-1	-9	-4	-8	 9	 8	 2	-3
	-10	-3	 0	-10	-9	-1	-3	-10	-9	-10
	-8	 9	 2	-9	-3	-1	 7	 4	-8	-10
	 9	-10	 7	 8	-9	 9	 4	-2	-1	-8
	 0	 7	-8	-3	-8	 2	 9	 8	 6	-8
	 6	 0	-8	 6	-9	-2	 7	-10	-8	 3
	-1	 8	-9	 4	 1	 4	 2	-7	-8	-9
���������� �������: 
	 9	 9	-2	 6	-4	-8	 9	 9	 9	 9
	-8	 9	-2	 9	 6	 0	-2	-10	 9	 9
	 9	-2	 9	 9	 9	-2	 2	 9	-6	-2
	 0	-4	 9	 9	-4	-8	 9	 8	 2	 9
	-10	 9	 0	-10	 9	 9	 9	-10	 9	-10
	-8	 9	 2	 9	 9	 9	 9	 4	-8	-10
	 9	-10	 9	 8	 9	 9	 4	-2	 9	-8
	 0	 9	-8	 9	-8	 2	 9	 8	 6	-8
	 6	 0	-8	 6	 9	-2	 9	-10	-8	 9
	 9	 8	 9	 4	 9	 4	 2	 9	-8	 9
	 
 */