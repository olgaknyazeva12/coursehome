//�������� �����, ������� ��������� ��� ����� a � b, ������� �� ����� ��
//��������

package task3_1;

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������� ��� ����� �����: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("���� ������ �����: " + a);
		System.out.println("���� ������ �����: " + b);

		raznost(a, b);

	}

	public static void raznost(int firstValue, int secondValue) {
		System.out.println("�������� ��������� ����� �����: " + (firstValue - secondValue));
	}
}
