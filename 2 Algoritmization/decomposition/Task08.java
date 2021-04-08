package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 8
 *	
 *		����� ������ D. ���������� ��������� �����: 
 *	D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 *  ���������. ��������� ����� (������) ��� ���������� ����� ���� 
 *  ��������������� ������������� ��������� ������� � �������� �� k �� m.
 *	
 */

public class Task08 {

	public static void main(String[] args) {
        
        // ������ D
        int n = 7; //����������� ������� D
        int[] d = getArray(n);

        // ������� ���������� ������ D �� �������
        System.out.println("������ D: " + arrayToString(d));

        // ������ ������� ������ ��������� ��������� �����
        int[] a = {1, 3, 4};

        // ������� ����� �����, ������ �������� ������� ������� � ������� "a".
        for (int i : a) {
            System.out.println("Sum" + i + " = " + getChain(d, i));
        }
    }

    // ���������� ����� ���� ��������� ������� ������� �� �������� � �������� k
    private static int getChain(int[] d, int k) {
        int sum = 0;
        for (int i = k; i < k + 3; i++) {
            sum += d[i];
        }
        return sum;
    }

    // ��������� ������ ��������� �����
    private static int[] getArray(int n) {
        int[] d = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            d[i] = rand.nextInt(21) - 10;
        }
        return d;
    }

    // ��������� ������������� ������� �����
    private static String arrayToString(int[] points) {
        String s = " ";
        for (int i = 0; i < points.length; i++) {
            s += points[i] + "; ";
        }
        return s;
    }
}

/*
   ��������� ������ ���������:

������ D:  2; -3; -8; 0; 6; -6; -6; 
Sum1 = -11
Sum3 = 0
Sum4 = -6

 */