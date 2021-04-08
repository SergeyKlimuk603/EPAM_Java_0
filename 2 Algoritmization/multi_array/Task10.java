package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 10
 *	
 *		����� ������������� �������� ������� ��������� �������.
 *	
 */

public class Task10 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int n = 10;

        // ������� �������
        int [][] a = createArray(n, n);

        // ������� ��������� ������ � �������
        System.out.print("��������� �������: \n");
        printArray(a);

        // ������� ������������ �������� ������� ���������
        System.out.println("������������ �������� ������� ���������:");
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > 0)
                System.out.print("\t" + a[i][i]);
        }
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
	 7	 3	 5	-8	-1	-6	 1	 6	 9	-1
	 9	 1	-3	-8	 4	 0	-4	 6	 8	-7
	-1	 7	 4	-3	 9	-9	 9	 8	-2	-3
	-4	-10	-1	-4	 6	 0	-9	-9	-5	 4
	 3	-1	 4	 5	-7	-5	 8	-10	-2	-6
	-10	 3	-7	-2	 6	-2	 6	-8	-1	 1
	-7	-3	-4	 9	 5	 8	 3	-3	-4	 1
	 1	-3	 3	 2	 2	-6	-8	-7	 5	 5
	 4	-5	-8	 4	 8	-8	-10	 5	 0	 7
	 5	-3	-7	 1	-8	-8	 8	-5	 9	 3
������������ �������� ������� ���������:
	7	1	4	3	3

 */