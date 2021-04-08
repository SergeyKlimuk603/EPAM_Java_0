package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 9
 *	
 *		������ ������� ��������������� �����. ��������� ����� ���������
 * � ������ �������. ����������, ����� ������� �������� ������������ �����.
 *	
 */

public class Task09 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int m = 5; // ����� ����� �������
        int n = 10; // ����� �������� �������

        // ������� �������
        int [][] a = createArray(m, n);

        // ������� ��������� ������ � �������
        System.out.print("��������� �������: \n");
        printArray(a);

        // ������ ��� �������� ����������� ���� � ������ �������
        int[] sumArray = new int[n];

        // ������� ����� ��������� � ������ ������� � ������� �� � �������
        System.out.println("����� ��������� � �������� �������:");
        int min = 0; // ������ ������� � ����������� ������ ���������
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArray[i] += a[j][i];
            }
            System.out.print("\t" + sumArray[i]);
            if (sumArray[min] > sumArray[i]) {
                min = i;
            }
        }

        // ������� ����� ������� � ����������� ��������� ����� ���������
        System.out.println("\n����� ������� � ����������� ������ ��������� (�� 0) = " + min);
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
    }
}

/*
   ��������� ������ ���������:

��������� �������: 
	2	5	1	0	8	4	5	7	7	6
	9	8	6	4	2	2	2	4	0	1
	4	4	2	1	3	8	1	5	9	7
	1	7	7	3	9	7	1	0	2	2
	2	5	3	9	3	3	5	7	7	9
����� ��������� � �������� �������:
	18	29	19	17	25	24	14	23	25	25
����� ������� � ����������� ������ ��������� (�� 0) = 6

 */