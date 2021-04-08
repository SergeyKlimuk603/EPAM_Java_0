package by.jonline.algoritmization.decomposition;

import java.util.Random;

/**
 * @author Sergey Klimuk
 *
 *   	2. Algoritmization
 *   
 *   	������������ � �������������� ������� (������������)
 *
 *   	������� 4
 *	
 *		�� ��������� ������ ������ ������������ "n" �����. �������� ����� (������),
 *   ������������, ����� ������ �� ��� ����� ����� ������� ����������.
 *   ��������. ���������� ����� ������� � ������.
 *
 *   �������:
 *   ������� ����� maxDistancePoints, � ������� ����� ���������� ������ ��������
 *   ����� � ������� ����� ���������� ������ �� ���� �����, ����������� ��
 *   ������������ ����������.
 *   ����� maxDistancePoints ����� �������� ����� getDistance, ������� �����
 *   �������� � ���� ������a ���������� ���� ����� � ���������� ����������
 *   ����� ����.
 *	
 */

public class Task04 {

	public static void main(String[] args) {

        // ������ �������� �����
        double[][] a = {{1, 2}, {5, 8}, {-6, 15}, {7, 14}, {0,11}, {-10, -3}};

        // ������� �� ����� ������� �����
        System.out.println("���� ����� � ������������ (x, y):");
        printPoints(a);
        System.out.println();

        // �������� ���������� �����������-��������� �����
        double[][] maxDistancePoints = maxDistancePoints(a);

        // ������� �� ����� ��������� �����
        System.out.println("���������� (x, y) �����������-��������� �����:");
        printPoints(maxDistancePoints);
        System.out.println("���������� ����� ������� = " + getDistance(maxDistancePoints));
    }

    // ����� ���������� ������ � ������������ ���� ����������� ��������� ����
    // �� ����� �����
    private static double[][] maxDistancePoints(double[][] points) {
        double[][] maxDistancePoints = new double[2][2];
        double maxDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistance(points[i], points[j]);
                if (maxDistance < distance) {
                    maxDistance = distance;
                    maxDistancePoints[0] = points[i];
                    maxDistancePoints[1] = points[j];
                }
            }
        }
        return maxDistancePoints;
    }

    // ����� ���������� ���������� ����� ���� �����
    private static double getDistance(double[]... a) {
        double distance = Math.sqrt(Math.pow(a[0][0] - a[1][0], 2) + Math.pow(a[0][1] - a[1][1], 2));
        return distance;
    }

    // ����� �� ������� �������� �����
    static void printPoints(double[][] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.print("(" + points[i][0] + ", " + points[i][1] + "), ");
        }
        System.out.println();
    }
}

/*
   ��������� ������ ���������:

���� ����� � ������������ (x, y):
(1.0, 2.0), (5.0, 8.0), (-6.0, 15.0), (7.0, 14.0), (0.0, 11.0), (-10.0, -3.0), 

���������� (x, y) �����������-��������� �����:
(7.0, 14.0), (-10.0, -3.0), 
���������� ����� ������� = 24.041630560342615

 */