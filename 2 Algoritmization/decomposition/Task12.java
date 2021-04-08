package by.jonline.algoritmization.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 12
 *	
 *		���� ����������� ����� K � N. �������� ����� (������) ������������
 * ������� �, ���������� �������� �������� �����, ����� ���� ������� �����
 * K � ������� �� ������ N.
 *
 * �������:
 * ����� ���������� ����� �� 0 �� N � ���������� � ������ ����� 
 * ��������������� �������: ��� ����� ���� ����� ������ ���� ����� K.
 *	
 */

public class Task12 {

	public static void main(String[] args) {

        // ����� N
        int n = 100;
        // ����� K
        int k = 23;

        // ������ ����� A (���������)
        List<Integer> a = new ArrayList<Integer>();

        // ������� ����������� ����� ���� kMax ��� ����� �� 0 �� N
        // ���� �������� ����� ���� 'k' ������� ��������� 0 < k < kMax, �� ��������� ��������� ����� k
        // � ������� ��������� �� ����
        int kMax = maxNumberSum(n);
        if (k > kMax || k < 0) {
            System.out.println("����� K = " + k
            					+ " �� ������������� ���������� ��������");
            k = new Random().nextInt(kMax);
            System.out.println("���� ������������ ��������� �����:");
        }
        System.out.println("K = " + k + "\nN = " + n);

        // ���������� ����� �� 0 �� N
        for (int i = 0; i <= n; i++) {
            // ���� �����, ���������� ������� �������
            if (numbersSum(i) == k) {
                a.add(i);
            }
        }

        // ������� �� ������ ���������� ������ �����
        print(a);
    }

    private static void print(List<Integer> a) {
        System.out.println("������ ���������� �����:");
        for (int x : a) {
            System.out.println(x);
        }
    }

    // ����� ����������� ������������ �������� ����� ���� ����� �� 0 �� N (�������)
    private static int maxNumberSum(int n) {

        // ���� ����� ������ 10-��, ������ ����� ���� ����� ����� ����� ������ �����
        if (n < 10) return n;

        // ����������, ������������ ������� 9 �� ���� �������� ����� ��������
        boolean r = true;

        // ����������� ��������� ����� ���� ����� � ��������� 0 - N
        int kMax = 0;
        while(n > 9) {
            // ������� ����� ������� ������ ������� �����
            int k = n % 10;
            // ��������� ������� 9 �� ���� �������� ����� ��������
            if (k != 9)
                r = false;

            // ������� ������� �� ����� (�������� ������� ������)
            n /= 10;
            if (n < 10) { // ��������� ��� ������� ��������� ������ � �����
                if (!r) { // ����������, ����� ����� �������� � kMax ��������� (������� �� ������� 9 � �������� ����� N)
                    kMax += 9 + (n - 1);
                } else {
                    kMax += 9 + n;
                }
            // ���� ����� ������� �������� ����� ��� ������� ��� �����, �� ���������, ��� �����������
            // ��������� �������� � ���� ������� ����� 9
            } else {
                kMax += 9;
            }
        }
        return kMax;
    }

    // ����� ����������� ������������ �������� ����� ���� ����� �� 0 �� N (����������� ���������)
    private static int maxNumberSum1(int n) {
        int kMax = 0;
        for (int i = 1; i <= n; i++) {
            int k = numbersSum(i);
            if (k > kMax)
                kMax = k;
        }
        return kMax;
    }

    private static int numbersSum(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

/*
   ��������� ������ ���������:

����� K = 23 �� ������������� ���������� ��������
���� ������������ ��������� �����:
K = 12
N = 100
������ ���������� �����:
39
48
57
66
75
84
93

 */