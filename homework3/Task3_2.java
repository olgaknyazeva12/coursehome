//Написать метод, который принимает три числа a, b, c. Выводит на экран a + b
//+ c

package task3_2;

import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("Введите три целых числа: ");

		a = printEnterValue(a);
		b = printEnterValue(b);
		c = printEnterValue(c);
		mySum(a, b, c);

	}

	@SuppressWarnings("resource")
	public static int printEnterValue(int enterValue) {
		Scanner scanner = new Scanner(System.in);
		enterValue = scanner.nextInt();
		System.out.println("Ваше число: " + enterValue);
		return enterValue;
	}

	public static void mySum(int first, int second, int third) {
		System.out.println("Сумма введенных чисел равна = " + (first + second + third));
	}
}
