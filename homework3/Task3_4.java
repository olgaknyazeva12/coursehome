//Написать метод, которые выводит любой переданный массив

package task3_4;

import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		System.out.println("Введите размер массива:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Размер вашего массива: " + size);

		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}
		print(mas);
	}

	public static void print(int[] masToPrint) {

		for (int i = 0; i < masToPrint.length; i++) {
			System.out.print(masToPrint[i] + " ");
		}
	}
}