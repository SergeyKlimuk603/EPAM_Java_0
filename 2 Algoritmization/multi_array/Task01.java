package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 1
 *	
 *		���� �������. ������� �� ����� ��� �������� �������, � �������
 * ������ ������� ������ ����������
 *	
 */

public class Task01 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int m = 5; // ���������� �����
        int n = 20; // ���������� ��������

        // ������� ������
        int[][] a = createArray(m, n);

        // ������� ��������� ������ � �������
        System.out.print("�������� ������: \n");
        printArray(a);

        // ������� ������� ��������������� ������� ������� � ������� �� � �������
        System.out.print("��������� ������� : \n");
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[0].length; i += 2) {
                if (a[0][i] > a[a.length - 1][i]) {
                    System.out.print("\t" + a[j][i]);
                }
            }
            System.out.println();
        }
    }

    // �������� ������� ����������� m x n
    static int[][] createArray(int m, int n) {
        Random rand = new Random();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }
        return a;
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

�������� ������: 
	0	0	6	9	0	1	8	9	3	2	2	9	9	0	2	7	8	6	8	6
	3	7	4	4	8	6	8	7	8	9	4	6	1	3	6	9	4	1	4	8
	9	5	4	5	4	9	9	5	4	6	0	4	1	0	3	0	1	3	1	2
	3	6	5	5	0	6	9	3	5	7	6	0	3	3	4	5	3	8	0	9
	8	2	4	7	2	9	8	7	9	7	2	8	4	7	9	0	9	0	5	7

��������� ������� : 
	6	9	8
	4	1	4
	4	1	1
	5	3	0
	4	4	5

 */