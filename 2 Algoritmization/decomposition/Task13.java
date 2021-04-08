package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 13
 *	
 *		��� ������� ����� ���������� "����������", ���� ��� ����������
 * ���� �� ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� 
 * "���������" �� ������� [n, 2n], ��� n - �������� ����������� ����� 
 * ������ 2. ��� ������� ������ ������������ ������������.
 *	
 */

public class Task13 {

	public static void main(String[] args) {

        // ����� n
        int n = 7;
        System.out.println("n = " + n);

        // ������� ������ �����
        int[] a = getArray(n);

        // ������� �� ������ ���������� ������ �����
        print(a);

        // ������� ���� ��������� �� ��������� �������
        printTwinks(a);
    }

    private static void printTwinks(int[] a) {
        System.out.println("���� ���������:");
        for (int i = 0; i < a.length - 2; i++) {
            System.out.println(a[i] + " : " + a[i+2]);
        }
    }

    private static int[] getArray(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = n + i;
        }
        return array;
    }

    private static void print(int[] a) {
        System.out.println("������ ���������� �����:");
        for (int x : a) {
            System.out.print(x + "; ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

n = 7
������ ���������� �����:
7; 8; 9; 10; 11; 12; 13; 14; 
���� ���������:
7 : 9
8 : 10
9 : 11
10 : 12
11 : 13
12 : 14

 */