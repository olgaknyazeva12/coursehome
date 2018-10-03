// Найти минимальное число из 2 чисел, вернуть минимальное
// Проверить четное число или нечетное, вернуть boolean результат
// Возвести число в квадрат, вернуть результат возведения
// Возвести число в куб, вернуть результат возведения
package task3_8;

public class Task3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board = 16;
		int firstNumber = (int) (Math.random() * board);
		int secondNumber = (int) (Math.random() * board);
		int thirdNumber = (int) (Math.random() * board);

		printValue(firstNumber);
		printValue(secondNumber);
		printValue(thirdNumber);

		int result1 = findMinValue(firstNumber, secondNumber);
		boolean result2 = chetnoeNochetnoe(firstNumber);
		int result3 = inKvadrat(thirdNumber);
		int result4 = cub(secondNumber);

		System.out.println("Минимальное число из первого и второго: " + result1);
		System.out.println("Четное ли первое число: " + result2);
		System.out.println("Квадрат третьего числа: " + result3);
		System.out.println("Куб второго числа: " + result4);

	}

	public static void printValue(int printNumber) {
		System.out.println("Случайно сгенерированное целое число = " + printNumber);
	}

	public static int findMinValue(int firstValue, int secondValue) {

		if (firstValue < secondValue)
			return firstValue;
		else
			return secondValue;
		
	}

	public static boolean chetnoeNochetnoe(int chetnoeOrNecetnoe) {

		return chetnoeOrNecetnoe % 2 == 0;
	}

	public static int inKvadrat(int myValue) {
		myValue = (int) (Math.pow(myValue, 2));
		return myValue;
	}

	public static int cub(int myValue) {
		myValue = (int) (Math.pow(myValue, 3));
		return myValue;
	}
}
