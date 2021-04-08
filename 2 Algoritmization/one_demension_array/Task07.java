package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 7
 *	
 *		���� �������������� ����� �1, �2, ..., �2n. ����� 
 *			max(a1 + a2n, a2 + a(2n-1), ..., an + a(n+1)).
 *	
 */

public class Task07 {

	public static void main(String[] args) {

        // ������ n
        int n = 5;

        // ������� ������ (������������������)
        double[] a = new double[2 * n];
        Random rand = new Random();
        for (int i = 0; i < 2 * n; i++) {
            a[i] = rand.nextDouble() * 10 - 5;
        }

        //������� ���������� ������������������ �� �����
        for (int i = 0; i < 2 * n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // ������� �������� �������� � ������� ������
        double max = a[0] + a[2 * n - 1]; // ��������� �� �������� ������ �������� ����� ������������������
        for (int i = 0; i < n; i++) {
            double temp = a[i] + a[2 * n - 1 - i];
            if (max < temp)
                max = temp;
        }
        System.out.println("max = " + max);
    }
}

/*
   ��������� ������ ���������:

a[0] = -1.5960569099039565
a[1] = -3.233732100218416
a[2] = -1.9688230650704277
a[3] = 3.750464658570234
a[4] = -2.2470119653870144
a[5] = 4.9265377581836365
a[6] = 3.063227288609223
a[7] = 3.4069201777571294
a[8] = 4.651362376052692
a[9] = 4.600810381922461
max = 6.81369194717945

 */

