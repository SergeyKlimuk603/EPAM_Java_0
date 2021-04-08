package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 14
 *	
 *		����������� �����, � ������ �������� n ����, ���������� ������
 * ����������, ���� ����� ��� ����, ����������� � ������� n, ����� ������
 * �����. ����� ��� ����� ���������� �� 1 �� k. ��� ������� ������
 * ������������ ������������
 *
 * ����������� ����� ���������� � ������� ���������� �� ����������� � 
 * ���������, ������� ��������� �����������, ������ � �������
 *	
 */

public class Task14 {

	public static void main(String[] args) {

        // ����� k
        int k = 1000000;
        System.out.println("k = " + k);

        System.out.println("����� ���������� �� ��������� �� 1 �� " + k);
        // ������� ����� ���������� � ������� �� �� �������
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i))
                System.out.println(i);
        }
    }

    // ���������� �������� �� ���������� ����� number ������ ����������
    private static boolean isArmstrongNumber(int number) {
        int x = (int) Math.pow(getNumbersSum(number), getAmountNumbers(number));
        if (number == x)
            return true;
        return false;
    }

    // ���������� ����� ���� ����� number
    private static int getNumbersSum(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        //System.out.println("sum = " + sum);
        return sum;
    }

    // ���������� ���������� ���� ����� number
    private static int getAmountNumbers(int number) {
        int n = 0;
        while(number > 0) {
            number /= 10;
            n++;
        }
        //System.out.println("n = " + n);
        return n;
    }
}

/*
   ��������� ������ ���������:

k = 1000000
����� ���������� �� ��������� �� 1 �� 1000000
1
2
3
4
5
6
7
8
9
81
512
2401

 */