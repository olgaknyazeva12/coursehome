package task2_10;

import java.util.Scanner;

public class Task2_10 {

	public static void main(String[] args) {

		System.out.println("Введите размер массива:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Размер вашего массива: " + size);

		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}

		System.out.print("Ваш массив: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}

		System.out.println(" ");

		for (int i = 0; i < size; i++) {
			if (i > 0) {
				if (mas[i - 1] >= mas[i]) {
					System.out.println("Заданный массив не является возрастающей последовательностью.");
					break;
				}
			}
			if (i == size - 1) {
				System.out.println("Заданный массив является возрастающей последовательностью.");
			}
		}

	}

}
