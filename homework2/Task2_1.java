package task2_1;
import java.util.Scanner;
public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������� ������ �������:");
		Scanner in = new Scanner (System.in);
		int size = in.nextInt();
		System.out.println("������ ������ �������: "+size);
		
		int a = 0;
		int b = 11;
		int mas[]= new int [size];
		int i = 0;
		System.out.print("������ � ������ �������: ");
		while (i<mas.length) {
			mas[i]=a+(int)(Math.random()*b);
			System.out.print(mas[i]+" ");
			i++;
		}
		
		System.out.println(" ");
		System.out.print("������ � �������� �������: ");
		int j = mas.length - 1;
		while (j>=0) {
			
			System.out.print(mas[j]+" ");
			j--;
		}
		
	}

}
