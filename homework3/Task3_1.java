//Написать метод, который принимает два числа a и b, выводит на экран их
//разность

package task3_1;

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите два целых числа: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Ваше первое число: " + a);
		System.out.println("Ваше второе число: " + b);

		raznost(a, b);

	}

	public static void raznost(int firstValue, int secondValue) {
		System.out.println("Разность введенных чисел равна: " + (firstValue - secondValue));
	}
}
