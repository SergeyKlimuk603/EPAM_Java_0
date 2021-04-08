package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������. ����������
 *
 *   	������� 3. ���������� �������
 *	
 *		���� ������������������ ����� a1 <= a2 <= ... <= an. ��������� 
 *	����������� �������� ���, ����� ��� ���� ����������� �� ��������. ���
 *  ����� � �������, ������� � �������, ���������� ���������� ������� � 
 *  �������� �� ������ �����, � ������ - �� ����� �����������. �����, 
 *  ������� �� �������, ��� ��������� �����������. �������� ��������
 *  ���������� �������
 *	
 */

public class Task03 {

	public static void main(String[] args) {

        // ������� ������ �������� ������� �������
        int[] array = {-5, -5, -3, 0, 0, 2, 3, 4, 5, 7, 10, 10};

        // ������� ������ �� �����
        System.out.print("������ array = ");
        printArray(array);

        // ��������� ������
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;// ������ ������������� ��������
            for (int k = i + 1; k < array.length; k++) {
                if (array[max] < array[k]) max = k;
            }
            if (max == i) continue;
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }

        // ������� ������ �� �����
        System.out.print("��������������� ������ array = ");
        printArray(array);
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
��������������� ������ array = 10, 10, 7, 5, 4, 3, 2, 0, 0, -3, -5, -5, 

 */