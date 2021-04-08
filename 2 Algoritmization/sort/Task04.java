package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������. ����������
 *
 *   	������� 4. ���������� ��������
 *	
 *		���� ������������������ ����� a1 <= a2 <= ... <= an. ���������
 * ����������� ����� � ������� �����������. ��� ����� ������������ ���
 * �������� ����� ai � a(i+1), �� �������� ������������. ��� ������������ 
 * �� ��� ���, ���� ��� �������� �� ������ ����������� � ������� �����������/.
 * ��������� �������� ����������, ����������� ��� ���� ����������
 * ������������.
 *
 * ��������� ������� ������: ����� ����������� ��������������� ������?
 *	
 */

public class Task04 {

	public static void main(String[] args) {

        // ������� ������ �������� ������� �������
        int[] array = {-5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10};

        // ������� ������ �� �����
        System.out.print("������ array = ");
        printArray(array);

        // ������� ������������
        int count = 0;

        // ��������� ������
        boolean needSort = true;// ���������� ������������� ����������
        while (needSort) {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    needSort = true;
                }
            }
        }

        // ������� ������ �� �����
        System.out.print("��������������� ������ array = ");
        printArray(array);
        System.out.print("���������� ������������ = " + count);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

������ array = -5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10, 
��������������� ������ array = -5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10, 
���������� ������������ = 0

 */