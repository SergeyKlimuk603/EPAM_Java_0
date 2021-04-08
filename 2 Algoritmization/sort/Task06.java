package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������. ����������
 *
 *   	������� 6. ���������� �����
 *	
 *		��� ������ n �������������� �����. ��������� ����������� ��� ��
 * �����������. �������� ��� ��������� �������: ������������ ��� ��������
 * �������� ai � a(i + 1). ���� ai <= a(i + 1), �� ������������ �� ���� 
 * ������� ������. ���� ���� ai > a(i + 1), �� ������������ ������������
 * � ���������� �� ���� ������� �����. ��������� �������� ���� ����������.
 *	
 */

public class Task06 {

	public static void main(String[] args) {

        // ����������� �������
        int n = 10;

        // ������� ������
        double[] array = getArray(n);

        // ������� ������ �� �����
        System.out.print("�������� ������������������ array:\n");
        printArray(array);

        // ��������� �������� ������������������
        int i = 1;
        while (i < array.length) {
            // ���� ai <= a(i + 1) - ������������ ������
            if (array[i - 1] <= array[i]) {
                i++;
                continue;
            // ���� ai > a(i + 1) - ������ �������� ������� � ������������ �����
            } else {
                double temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                if (i > 1) i--;
            }
        }

        // ������� ������ �� �����
        System.out.print("��������������� ������������������ array:\n");
        printArray(array);
    }

    // �������� �������
    static double[] getArray(int n) {
        Random rand = new Random();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextDouble() * 21 - 10;
        }
        return array;
    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f; ", array[i]);
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

�������� ������������������ array:
-5,65; 0,11; 9,61; 2,23; 5,01; -4,40; 5,82; -1,56; 5,70; 8,84; 
��������������� ������������������ array:
-5,65; -4,40; -1,56; 0,11; 2,23; 5,01; 5,70; 5,82; 8,84; 9,61; 

 */