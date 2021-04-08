package by.jonline.basic.cycle;

/**
 * @author Sergey Klimuk
 *
 *		1. Basics of software code development
 * 
 *      �����
 *
 *      ������� 8
 * 
 *     ���� ��� �����. ���������� �����, �������� � ������ ��� �������
 *  ��� � ������� �����
 */

public class Task08 {

	public static void main(String[] args) {

        //������������ �����
        int a = 234567;
        int b = 988776655;

        //������� ���������� ���������� ����
        int count = 0;

        // ������ ��� �������� ���������� ���������� ����
        char c[] = new char[10];

        //����������� ����� � ������
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);

        //���������� � ������ c[] ���������� ����� ��� �����:
        // ���������� ������ ������ ������� �����
        for (int i = 0; i < aString.length(); i++) {
            char c1 = aString.charAt(i);

            //������ ����������� ����� ��� ������ � ������
            int index = Character.getNumericValue(c1);

            //���������� ���������� ������ � ������� ������� �����
            for (int j = 0; j < bString.length(); j++) {

                //���� ����� �����, ���������� ���������� �������� � ������ �� ������� �����
                if (c1 == bString.charAt(j)) {
                    c[index] = c1;
                }
            }
        }

        System.out.println("���������� ����� ����� " + "a = " + a 
        					+ " � b = " + b + ": ");

        //������� �� ����� ���������� �������� �������, ������� ������������� ���������� ������ �����
        for (int i = 0; i < 10; i++) {
            if (c[i] != '\u0000') {
                System.out.print(c[i] + "; ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("����� �� �������� ���������� ����");
        }
    }
}

/*
��������� ������ ���������:

���������� ����� ����� a = 234567 � b = 988776655: 
5; 6; 7; 

 */
