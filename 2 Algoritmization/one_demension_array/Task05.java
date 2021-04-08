package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 5
 *	
 *		���� ����� ����� �1, �2, ..., �n. ������� �� ������ ������ �� 
 *	�����, ��� ������� ai > i.
 *	
 */

public class Task05 {

	public  static void main(String[] args) {

        // ������ ����������� �������
        int n = 10;

        // ������� ������
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            a[i] = rand.nextInt(n);
        }

        // ��������� ������� ai > i
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.println("a[" + i + "] = " + a[i]);
            }
        }
    }
}

/*
   ��������� ������ ���������:

a[0] = 4
a[1] = 4
a[2] = 5
a[3] = 7
a[5] = 9

 */

