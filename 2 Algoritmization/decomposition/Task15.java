package by.jonline.algoritmization.decomposition;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 15
 *	
 *		����� ��� ����������� n-������� �����, ����� � ������� �������� 
 *	������ ������������ ������������������ (��������, 1234, 5678). ��� 
 *	������� ������ ������������ ������������
 *	
 */

public class Task15 {

	public static void main(String[] args) {

        // ������� ����������� ����� �� 1 �� 9
        int n = 4;
        System.out.println("n = " + n);

        // ������� ������������ ������������������ �����
        findIncreasingNumbers(n);
    }

    // ������� ������������ ������������������ �����
    private static void findIncreasingNumbers(int n) {
        for (int j = 1; j <= 10 - n; j++) {
            int number = getIncreasingNumber(n, j);
            System.out.println(number);
        }
    }

    // ��������� ������������ �����
    private static int getIncreasingNumber(int n, int firstNumber) {
        int number = 0;
        for(int i = firstNumber; i < n + firstNumber; i++){
            number = number * 10 + i;
        }
        return number;
    }
}

/*
   ��������� ������ ���������:

n = 4
1234
2345
3456
4567
5678
6789

 */