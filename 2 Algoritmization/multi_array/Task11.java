package by.jonline.algoritmization.multi_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������. ������� ��������
 *
 *   	������� 11
 *	
 *		������� 10�20 ��������� ���������� ������� �� 0 �� 15. �������
 * �� ����� ���� ������� � ������ �����, � ������� ����� 5 �����������
 * ��� � ����� ���
 *	
 */

public class Task11 {

	public static void main(String[] args) {

        // ����������� �������
        int m = 10;
        int n = 20;

        Random rand = new Random();

        // ������� �������
        int [][] a = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                a[j][i] = rand.nextInt(16);
            }
        }

        // ������� ������� �� �����
        System.out.print("��������� �������: \n");
        for (int[] line : a) {
            for (int an : line) {
                // �������� ������������� ����� �� ���� ������ �����, ����� ������� ��������� ����� �������
                if (an > 9)
                    System.out.print("\t " + an);
                else
                    System.out.print("\t  " + an);
            }
            System.out.println();
        }

        // ������� ������ � ������� ����� 5 ����������� ��� � ����� ���
        System.out.println("������ �����, ��� ����� 5 �����������"
        		           + " 3 � ����� ���:");
        for (int j = 0; j < a.length; j++) {
            int count5 = 0; // ������� ����� 5
            for (int i = 0; i < a[j].length; i++) {
                if (a[j][i] == 5) {
                    count5++;
                    if (count5 >= 3) {
                        System.out.println("\t " + j);
                        break;
                    }
                }
            }
        }
    }
}

/*
   ��������� ������ ���������:

��������� �������: 
	 13	 15	  5	  2	  3	  5	  3	  2	  5	  2	 15	  3	  6	  6	  8	 15	  8	  7	  2	 11
	 10	  1	  9	  9	 14	  5	 11	  2	  2	 12	  8	 10	 10	 11	 14	 13	  8	  3	  6	  1
	  0	  1	  0	  6	 15	 11	  8	  2	 13	  4	  5	 13	  8	  1	 14	  8	 15	  8	 13	 13
	  7	  5	 11	 13	  0	 10	 15	 15	  3	  2	 14	  5	  6	  0	  8	  1	  5	  1	  7	  4
	  1	 15	  8	  9	 15	 12	  4	 10	 10	 15	 10	 11	  8	 11	 10	  7	  7	 11	  0	 14
	 10	  5	  4	  4	  5	  7	  6	  3	  8	 10	  2	  8	  7	  2	  9	  0	  6	  9	 15	  6
	  5	  6	 12	  6	  8	 12	  8	 10	  2	 10	 15	 12	  1	  2	  7	  4	 14	  0	 11	 12
	  5	  6	 14	 15	  5	 11	 15	  2	  1	  7	  2	  0	 14	 10	  8	 13	  6	 11	  5	 15
	  3	  2	  4	  4	  0	 11	  1	  9	  1	 14	 11	  6	  1	  4	  2	 15	  8	  6	  5	 10
	  0	 13	  8	  8	  1	  3	  0	  5	  4	  1	 15	  4	  5	  7	 12	 13	 12	 13	  8	  7
������ �����, ��� ����� 5 ����������� 3 � ����� ���:
	 0
	 3
	 7
 */