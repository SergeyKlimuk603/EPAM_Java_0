package by.jonline.algoritmization.sort;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������. ����������
 *
 *   	������� 5. ���������� ���������
 *	
 *		���� ������������������ ����� a1, a2, ..., an. ��������� 
 *	����������� ����� � ������� �����������. �������� ��� ��������� 
 *	�������. ����� a1, a2, ..., ai - ������������� ������������������, 
 *	�.�. a1 <= a2 <= ... <= an. ������� ��������� ����� a(i + 1) � 
 *  ����������� � ������������������ ���, ����� ����� ������������������
 *  ���� ���� ������������. ������� ������������ �� ��� ���, ���� ��� 
 *  �������� �� (i + 1) �� n �� ���� ���������.
 *  ����������. ����� ��������� ���������� �������� � ��������������� 
 *  ����� ����������� � ������� ��������� ������. �������� ����� ��������
 *  � ���� ��������� �������
 *	
 */

public class Task05 {

	static int[] array;

    public static void main(String[] args) {

        // ����������� �������
        int n = 10;

        // ������� ������
        array = getArray(n);

        // ������� ������ �� �����
        System.out.print("�������� ������������������ array:\n");
        printArray(array);

        // ��������� �������� ������������������
        for (int i = 1; i < array.length; i++) {

            // �������� ���������� ������������ ��������
            int next = array[i];

            // ������� ������ �����, ���� ����� �������� ��������� �������
            int index = binSearch(0, i - 1, next);

            // �������� ��������������� ����� ������� �� index ������
            for (int j = i; j > index; j--) {
                array[j] = array[j - 1];
            }

            // �������� � �������������� ������ ����������� �������
            array[index] = next;
        }

        // ������� ������ �� �����
        System.out.print("��������������� ������������������ array:\n");
        printArray(array);
    }

    // ������� ��������� ������ (����� ������� �����)
    static int binSearch(int leftIndex, int rightIndex, int element) {
        // ���� � ���������� �������� ���� ������, ������ element �����
    	// �������� ���� � ��� ������ ���� � ��������� (������� �� ����,
    	// ������ ��� ������ �������� ����� ������)
        if (leftIndex == rightIndex) {
            if (element < array[leftIndex]) {
                return leftIndex;
            } else {
                return ++leftIndex;
            }
        }
        // ������� ������� ������ �������. ���� element ������ �������� �
        // ���� ������, �� ��������� � ����� ����� ������� � ����������
        // �����, � ��������� ������, ���������� ����� � ������ �����
        int middle = (rightIndex - leftIndex) / 2 + leftIndex;
        if (element < array[middle]) {
            rightIndex = middle--;
        } else {
            leftIndex++;
        }
        return binSearch(leftIndex, rightIndex, element);
    }

    // �������� �������
    static int[] getArray(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(21) - 10;
        }
        return array;
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

�������� ������������������ array:
-9, 0, 4, -2, 3, -8, 2, 2, 0, 3, 
��������������� ������������������ array:
-9, -8, -2, 0, 0, 2, 2, 3, 3, 4, 

 */