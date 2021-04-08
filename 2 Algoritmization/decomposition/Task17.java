package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 17
 *	
 *		�� ��������� ����� ����� ����� ��� ����. �� ���������� ����� 
 *	����� ����� ��� ���� � �.�. ������� ����� �������� ���� ����������, 
 *	����� ��������� ����? ��� ������� ������ ������������ ������������
 *	
 */

public class Task17 {

	public static void main(String[] args) {

        // �������� �����
        int x = 5000;
        System.out.println("�������� �����:" + x);

        // ���������� ����� (��������) ����������� ��� ���������� �������
        int steps = getSteps(x);
        System.out.println("��� ���������� �������, ��� �������� �����: "
        					+ x + ", ���������� ��������� " + steps 
        					+ " ��������.");
    }

	// ��������� ����������� ���������� ����� (��������)
    private static int getSteps(int x) {
        int steps = 0;
        while(x > 0) {
            x -= getNumbersSum(x);
            steps++;
        }
        return steps;
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
}

/*
   ��������� ������ ���������:

�������� �����:5000
��� ���������� �������, ��� �������� �����: 5000, ���������� ��������� 354 ��������.

 */