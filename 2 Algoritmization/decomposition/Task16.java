package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 16
 *	
 *		�������� ���������, ������������ ����� n-������� �����, ����������
 * ������ �������� �����. ���������� �����, ������� ������ ���� � ��������� �����. ��� ������� ������ ������������
 * ������������.
 *	
 */

public class Task16 {

	public static void main(String[] args) {

        // ������ �������� n-������� ����� ���������� ������ �������� �����
        int[] a = {13579, 97531, 11111, 33333, 55555, 77777, 99999};
        System.out.println("�������� �����:");
        printArray(a);

        //��������� ����� �������� �����
        int sum = getSum(a);
        System.out.println("����� �������� ����� �����: " + sum);

        int amountEvenNumbers = getEvenNumbers(sum);
        System.out.println("���������� ������ ���� � ���������� �����: "
        					+ amountEvenNumbers);
    }

	// ��������� ������� ������ ���� � �������� �����
    private static int getEvenNumbers(int sum) {
        int amount = 0;
        while(sum > 0) {
            // �������� ������� ������
            int x = sum % 10;
            // ��������� �� ��������
            if (x % 2 == 0) {
                amount++;
            }
            sum /= 10;
        }
        return amount;
    }

    // ��������� ����� ����� �������
    private static int getSum(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    // ������� ������ �� �����
    private static void printArray(int[] a) {
        for (int x :a) {
            System.out.println(x);
        }
    }
}

/*
   ��������� ������ ���������:

�������� �����:
13579
97531
11111
33333
55555
77777
99999
����� �������� ����� �����: 388885
���������� ������ ���� � ���������� �����: 4

 */