package by.jonline.algoritmization.one_demension_array;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	���������� �������
 *
 *   	������� 1
 *	
 *		� ������ �[N] �������� ����������� �����. ����� ����� ��� 
 *	���������, ������� ������ �.
 *	
 */

public class Task01 {

	public static void main(String[] args) {

        //������� ������
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
        			12, 13, 14, 15, 16, 17, 18, 19, 20};
        int k = 3;

        int sum = 0;

        for (int an : a) {
            if ((an % k) == 0)
                sum += an;
        }

        System.out.println("sum = " + sum);
    }
}

/*
   ��������� ������ ���������:

sum = 63

 */

