package twopackage;

public class DiffrTypes {

	public static void main(String[] args) {

		// (А) Создать переменные следующих типов:
		int i = 0b10;
		short s = 44;
		long l = 122222;
		double d = 555555.35;
		float f = 90.35f;
		char c = 'b';
		boolean boo = true;

		// (Б) Создать переменные необходимых типов и присвоить им результат следующих
		// операций
		int result1 = i + s; // сумма int и short
		double result2 = l - d; // разность long и double
		double result3 = f * d; // произведение float и double

		// результат сравнения long > double,
		if (l > d) {
			System.out.println("long > double");
		}

		else {
			System.out.println("long < double");
		}

		// результат сравнения float < int
		if (f < i) {
			System.out.println("float < int");
		} else {
			System.out.println("float > int");
		}

		// результат сравнения на равенство/неравенство пример№1
		if (i == l) {
			System.out.println("int = long");
		} else {
			System.out.println("int != long");
		}

		//// результат сравнения на равенство/неравенство пример№2
		if (i != d) {
			System.out.println("int ! = double");
		} else {
			System.out.println("int == long");
		}
		System.out.println(" ");
		System.out.println("Заданные переменные");

		System.out.println("i = " + i + ", s = " + s + ", l = " + l + ", d = " + d + ", f = " + f + ", c = " + c
				+ ", boo = " + boo);

		// Вывод с PRINTLN
		System.out.println(" ");
		System.out.println("Вывод результатов с помощью println: ");
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println(" ");

		// Вывод с PRINT
		System.out.print(" ");
		System.out.print("Вывод результатов с помощью print: ");
		System.out.print(" result1 = " + result1);
		System.out.print(" result2 = " + result2);
		System.out.print(" result3 = " + result3);

		// Вывод с PRINTF
		System.out.println(" ");
		System.out.printf("Вывод String переменной с помощью printf: ");
		String str = "Привет";
		System.out.printf(str);

	}

}
