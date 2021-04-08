package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������. ����������
 *
 *   	������� 8
 *	
 *		���� ����� p1/q1, p2/q2, ..., pn/qn (pi, qi - �����������). 
 *	��������� ���������, ������� �������� ��� ����� � ������ �����������
 *	� ������������� �� � ������� �����������.
 *
 *  �������:
 *  �������� ��� ������� 'p' � 'q'. ������ 'p' �������� ��� ��������� 
 *  ������, 'q' - ��� �����������. ����� ��� ������� 'q' ������� ���, 
 *  ������������� ��� ����� ����������� � ��������� �������� 'p'. �����
 *  ���������� ����� ����� �������� �� ����� ��������� 'p' �������� �� ���.
 */

public class Task08 {

	// ��������������� ���������� ��� ���������� ���
    static long a;
    static long b;

    public static void main(String[] args) {

        // ����������� �������
        int n = 10;

        // ������ ��������� ��������
        int rangeP = 100; //����������
        int rangeQ = 10; //������������

        // ������� ������ ���������� ����� 'p'
        long[] arrayP = getArray(n, false, rangeP);
        // ������� ������ ������������ ����� 'q'
        long[] arrayQ = getArray(n, true, rangeQ);

        // ������� ���������� ����� �� �����
        System.out.print("�������� �����:\n");
        printArray(arrayP, arrayQ);

        // ��� ��� 'q'
        long gcd = arrayQ[0];
        // ��� ��� 'q'
        long lcm = arrayQ[0];

        // ������� ��� ��� 'q'
        for (int k = 1; k < arrayQ.length; k++) {
            // ��������� a ������ ��� ���� ��������� 'q' �� q0 �� q(k - 1)
            a = lcm;
            b = arrayQ[k];
            if (a < b) swap();
            // ������� ��� ��� a � b
            while (b > 0) {
                a %= b;
                swap();
            }
            gcd = a;
            // ������� ��� ��� ��������� �� q0 �� qk
            lcm = lcm / gcd * arrayQ[k];
        }
        // � ����� ����� �������� ��� ��� ���� ��������� 'q'
        System.out.println("��� ��� ���� ������������ 'q' = " + lcm);

        //������� �������� ���������� ������ ����������� � ������ �����������
        for (int k = 0; k < arrayP.length; k++) {
            arrayP[k] *= lcm / arrayQ[k];
            arrayQ[k] = lcm;
        }

        //��������, ��� ��� ����� �� ������� � ������ �����������, �� �����
        //������������� ����� ���� �� �������� �� ����������
        sort(arrayP);
        
        // ������� ������ �� �����
        System.out.print("���������������, ����������� � ������ "
        					+ "����������� �����:\n");
        printArray(arrayP, arrayQ);
    }

    static void swap() {
        long temp = a;
        a = b;
        b = temp;
    }
    
    // ���������� ������� ������� ������������ (�����������)
    static void sort(long[] array) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    long temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    needSort = true;
                }
            }
        }
    }

    // �������� ������� �����
    // ���� ��� ������ ������������, �� �� ����� ��������� ������ ������������� �����
    // �.�. ���� ����� ����� ����������� � ���������
    static long[] getArray(int n, boolean onlyPositive, int range) {
        Random rand = new Random();
        long[] array = new long[n];
        int negativeRange = range;
        if (onlyPositive) negativeRange = 0;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(range + negativeRange) - negativeRange;
            // ���������, ����� ����������� �� ��� ����� ����
            if (onlyPositive && array[i] == 0) array[i] = 1;
        }
        return array;
    }

    static void printArray(long[] array1, long[] array2) {
        for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "/" + array2[i] + ";  ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

�������� �����:
39/1;  79/8;  8/3;  -11/8;  39/4;  81/9;  52/6;  -93/4;  -32/6;  -4/3;  
��� ��� ���� ������������ 'q' = 72
���������������, ����������� � ������ ����������� �����:
-1674/72;  -384/72;  -99/72;  -96/72;  192/72;  624/72;  648/72;  702/72;  711/72;  2808/72;  

 */