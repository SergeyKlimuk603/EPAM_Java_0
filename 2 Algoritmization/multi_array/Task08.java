package by.jonline.algoritmization.multi_array;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 8
 *	
 *		� �������� ������� �������� ������� ��� ������� ����� �������,
 * �.�. ��� �������� ������ ������� ��������� �� ��������������� ��
 * ������� �������, � ��� �������� ������� ����������� � ������. ������
 * �������� ������ ������������ � ����������.
 *	
 */

public class Task08 {

	public static void main(String[] args) {

        // ������ ����������� �������
        int m = 5; // ����� ����� �������
        int n = 10; // ����� �������� �������

        // ������� �������
        int [][] a = createArray(m, n);

        // ������� ��������� ������ � �������
        System.out.print("��������� �������: \n");
        printArray(a);

        // ������ �������� ��������
        int x = 0;
        int y = 0;

        //������� ������ Scanner ��� ����� � ����������
        Scanner sc = new Scanner(System.in);

        // ����������� ���� ������� ������� x
        while (true) {
            System.out.print("������� ����� ������ ������� (�� 0 �� " 
            				+ (n - 1) + "): ");
            if (sc.hasNextInt() && (x = sc.nextInt()) >= 0 && x < n) {
            	sc.nextLine();
                break;
            } else {
                System.out.println("��������� �������� �����������!");
                sc.nextLine();
            }
        }

        // ����������� ���� ������� ������� y
        while (true) {
            System.out.print("������� ����� ������� ������� (�� 0 �� " 
            				+ (n - 1) + "): ");
            if (sc.hasNextInt() && (y = sc.nextInt()) >= 0 && y < n) {
            	sc.nextLine();
                break;
            } else {
                System.out.println("��������� �������� �����������!");
                sc.nextLine();
            }
        }
        sc.close();

        if (x != y) {
            for (int j = 0; j < a.length; j++) {
                int temp = a[j][x];
                a[j][x] = a[j][y];
                a[j][y] = temp;
            }
        }
        
        // ������� ���������� ������ � �������
        System.out.print("\n�������� �������: " + x + " � " + y + "\n");
        printArray(a);
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

��������� �������: 
	9	5	5	9	1	3	8	3	2	0
	9	8	9	4	1	6	4	4	1	9
	7	1	1	5	2	1	2	4	4	3
	7	7	4	5	5	1	8	8	9	1
	0	4	7	4	5	5	2	8	8	6

������� ����� ������ ������� (�� 0 �� 9): werg
��������� �������� �����������!
������� ����� ������ ������� (�� 0 �� 9): 2
������� ����� ������� ������� (�� 0 �� 9): 45
��������� �������� �����������!
������� ����� ������� ������� (�� 0 �� 9): 7

�������� �������: 2 � 7
	9	5	3	9	1	3	8	5	2	0
	9	8	4	4	1	6	4	9	1	9
	7	1	4	5	2	1	2	1	4	3
	7	7	8	5	5	1	8	4	9	1
	0	4	8	4	5	5	2	7	8	6

 */