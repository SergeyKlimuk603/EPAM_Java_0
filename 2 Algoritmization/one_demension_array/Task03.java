package by.jonline.algoritmization.one_demension_array;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 3
 *	
 *		��� ������ �������������� �����, ����������� �������� N. 
 *	����������, ������� � ��� �������������, ������������� � ������� 
 *	���������
 *	
 */

public class Task03 {

	public  static void main(String[] args) {

        //������ ����������� �������
        int n = 20;

        //�������� ��������
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        //��������� ��������� ����� ��� �������� �������
        Random rand = new Random();

        // ������� ������
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextDouble() * 10 - 5;
        }

        // ���������� ���������� ������� �� ��������� � ������� � ������� �������� ���������
        for (double an : a) {
            if (an < 0)
                countNegative++;
            else if (an > 0)
                countPositive++;
            else
                countZero++;
            System.out.println(an);
        }

        System.out.println();
        System.out.println("������������ ���������: " + countPositive);
        System.out.println("������������� ���������: " + countNegative);
        System.out.println("������� ���������: " + countZero);
    }
}

/*
   ��������� ������ ���������:

-4.096144268448883
2.3582051057204714
-0.03948752769041164
0.9856580803007065
1.74044131533463
-3.5837500490028553
-2.926087227758456
-0.5319752148016699
3.3408630495702596
1.1139423076322332
1.2922857267314374
-4.698553254418285
4.102891524974968
-0.9648501670203551
-3.9351431281521876
-3.099229761887635
-4.34142660178797
-3.7671487717456884
-2.2612123817047958
-4.263200358179079

������������ ���������: 7
������������� ���������: 13
������� ���������: 0

 */

