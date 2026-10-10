import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		int num1 = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter an operator (+, -, *, /, %):");
		String operator = scanner.nextLine();
		
		System.out.println("Enter the second integer:");
		int num2 = scanner.nextInt();
		
		if (operator.equals("+")) {
			int operacio = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + operacio);
		
		} else if (operator.equals("-")) {
			int operacio = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + operacio);
		
		} else if (operator.equals("*")) {
			int operacio = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + operacio);
		
		} else if (operator.equals("/")) {
			if (num2 == 0) {
				System.out.println("Error: Division by zero is not allowed");
			} else {
				int operacio = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + operacio);
			}
				
		} else if (operator.equals("%")) {
			if (num2 == 0) {
				System.out.println("Error: Division by zero is not allowed");
			} else {
				int operacio = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + operacio);
			}
		
		} else {
			System.out.println("Invalid operator!");
		}
		
	}
}