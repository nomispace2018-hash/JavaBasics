import java.util.Scanner;

public class BinaryConversion {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int num = 0;
		int residu = 0;
		String representacio = "";

		
		System.out.println("Enter a positive number: ");
		num = scanner.nextInt();
		
		while (num > 0) {
			residu = num % 2;
			representacio = residu + representacio;
			num = num / 2;
		}
		
		System.out.println("Binary: " + representacio);
	}
}