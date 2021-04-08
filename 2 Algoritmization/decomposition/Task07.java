package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 7
 *	
 *		�������� ����� (������) ��� ���������� ����� ����������� ����
 * �������� ����� �� 1 �� 9
 *	
 */

public class Task07 {

	public static void main(String[] args) {

        int n = 9;

        // ��������� ����� ����������� �������� ����� �� 1 �� n
        System.out.println("����� ����������� �������� ����� �� 1 �� " + n
                + " ����� " + getFactorialSum(n));

    }

    // ���������� ������������ ����������� �������� �����
    private static int getFactorialSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += getFactorial(i);
        }
        return sum;
    }

    // ���������� ���������� �����
    private static int getFactorial(int n) {
       if (n > 1) {
           n = n * getFactorial(n - 1);
       }
        return n;
    }
}

/*
   ��������� ������ ���������:

����� ����������� �������� ����� �� 1 �� 9 ����� 368047

 */