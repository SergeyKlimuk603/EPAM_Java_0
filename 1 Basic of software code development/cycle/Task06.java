package by.jonline.basic.cycle;

/**
 * @author Sergey Klimuk
 *
 *   	1. Basics of software code development
 *   
 *   	�����
 *
 *   	������� 6
 *	
 *		������� �� ����� ������������ ����� ��������� � �� ����������
 * ������������� � ������ ����������
 */

public class Task06 {

	public static void main(String[] args) {

        //��������� ������� � ���� ������� 256�256
        for (int j = 0; j < 256; j++){
            int j256 = j * 256;
            for (int i = 0; i < 256; i++) {
                int ji = j256 + i;
                char c = (char) ji;
                System.out.print(c + " = " + ji + ";  ");
            }
            //��������� �� ��������� ������� �������
            System.out.println();
        }
    }
}

/*
   ��������� ������ ���������:

��������� ���������� ��������� ����� ����������, � �� ���� �������� 
��� � ������ ���������

 */
