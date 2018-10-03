
//Способ 1

package task2_3;

import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) {

		System.out.println("Введите размер массива:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Размер вашего массива: " + size);

		int mas[] = new int[size];
		int a = 0;
		int b = 10;
		int k = 0;
		System.out.print("Ваш массив: ");
		for (int i = 0; i < size; i++) {
			mas[i] = a + (int) (Math.random() * b);
			System.out.print(mas[i] + " ");
			k++;
		}
		if (k > 2) {
			System.out.println(" ");
			System.out.print("Массив после умножения: ");
			for (int i = 2; i < size; i += 3) {

				System.out.print((mas[i] * 2) + " ");
			}
		} else {
			System.out.println(" ");
			System.out.println("В массиве меньше трех элементов.");
		}
	}

}
