import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		int int1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter an operator (+, -, *, /, %):");
		String operator = scanner.nextLine();
		System.out.println("Enter the second integer:");
		int int2 = scanner.nextInt();
		
		if (operator.equals("+")) {
			int operacio = int1 + int2;
			System.out.println(int1 + " " + operator + " " + int2 + " = " + operacio);
		} else if (operator.equals("-")) {
			int operacio = int1 - int2;
			System.out.println(int1 + " " + operator + " " + int2 + " = " + operacio);
		} else if (operator.equals("*")) {
			int operacio = int1 * int2;
			System.out.println(int1 + " " + operator + " " + int2 + " = " + operacio);
		} else if (operator.equals("/") &&  int2 != 0) {
			double operacio = (double)int1 / (double)int2;
			System.out.println(int1 + " " + operator + " " + int2 + " = " + operacio);
		} else if (operator.equals("%")) {
			int operacio = int1 % int2;
			System.out.println(int1 + " " + operator + " " + int2 + " = " + operacio);
		} else if (operator.equals("/") &&  int2 == 0) {
			System.out.println("Error: Division by zero is not allowed");
		} else {
			System.out.println("Invalid operator!");
		}
	}
}