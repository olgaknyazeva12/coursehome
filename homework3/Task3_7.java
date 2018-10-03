package task3_7;

import java.util.Scanner;

public class Task3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������� ������ �������:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("������ ������ �������: " + size);

		float[] mas = new float[size];
		System.out.println("�������� ��������������� ������: ");
		printMassiv(mas);
		changeMassiv(mas);
		System.out.println();
		System.out.println("���������� ������: ");
		printMassivAfterOperation(mas);

	}

	public static void printMassiv(float myMassiv[]) {
		for (int i = 0; i < myMassiv.length; i++) {
			myMassiv[i] = (float) (Math.random() * 11);
			System.out.print(myMassiv[i] + "  ");
		}
	}

	public static void printMassivAfterOperation(float myMassiv[]) {
		for (int i = 0; i < myMassiv.length; i++) {
			System.out.print(myMassiv[i] + "  ");
		}
	}

	public static void changeMassiv(float myMassiv[]) {
		for (int i = 2; i < myMassiv.length; i += 3) {
			myMassiv[i] = -1;
		}

	}
}