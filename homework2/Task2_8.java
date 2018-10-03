package task_8;

import java.util.Scanner;

public class Task2_8 {
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
		int min = mas[0];
		int max = mas[0];
		for (int i = 0; i < size; i++) {
			if (mas[i] < min)
				min = mas[i];
		}
		System.out.println(" ");
		System.out.println("Минимальный элемент массива: " + min);
		for (int i = 0; i < size; i++) {
			if (mas[i] > max)
				max = mas[i];
		}

		System.out.println("Максимальный элемент массива: " + max);

	}
}
