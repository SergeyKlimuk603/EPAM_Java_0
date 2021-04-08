package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 9
 *	
 *		���� ����� X, Y, Z, T - ����� ������ ����������������. �������� 
 *	����� (������) ���������� ��� �������, ���� ���� ����� ��������� 
 *	������ X � Y - ������.
 *
 *	�������:
 *  �������� ��������������� �� ��� ������������, ���� �� �������  - 
 *  ������������� � ������ ����� �������� ������� ������������ �� ���� 
 *  �������� �� �������:
 *            S��. = sqrt(p * (p - a) * (p - b) * (p - c))
 *            ���: a, b, c - ������� ������������
 *            p - ������������ ������������ �� �������:
 *            p = (a + b + c) / 2
 *	
 */

public class Task09 {

	public static void main(String[] args) {

        Random rand = new Random();

        // ������� ����������������
        double x;
        double y;
        double z;
        double t;
        // ���������� �������������� ������������ (����� ������� ���� �������������)
        double xy;

        // ������� � ��������� ����������� ������������� ���������������� � �����������
        // ��������� � (��� �������) ����� ������ �����
        do {
            x = rand.nextInt(10) + 1;
            y = rand.nextInt(10) + 1;
            z = rand.nextInt(10) + 1;
            t = rand.nextInt(10) + 1;
            xy = Math.sqrt(x * x + y * y);

        } while (xy >= (z + t) || z >= (xy + t) || t >= (xy + z));

        // ������� ���������������� ����� ����� �������� ���� �������������
        double s = getTriangleArea(x, y, xy) + getTriangleArea(z, t, xy);

        System.out.println("������� ����������������:");
        System.out.print("x = " + x + "; ");
        System.out.print("y = " + y + "; ");
        System.out.print("z = " + z + "; ");
        System.out.println("t = " + t + "; ");
        System.out.println("������� ����������������:\nS = " + s);
    }

    // ���������� ������� ������������ �� ���� ��������
    private static double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}

/*
   ��������� ������ ���������:

������� ����������������:
x = 10.0; y = 2.0; z = 9.0; t = 5.0; 
������� ����������������:
S = 32.49444375840399

 */