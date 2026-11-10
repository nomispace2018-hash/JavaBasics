import java.util.Scanner;

public class DivisibleByN {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int divisor = 0;
		int maxValue = 0;
		String recordar = "";
		
		//Pedir un divisor
		System.out.println("Enter the divisor (greater than 1):");
		divisor = scanner.nextInt();
		
		//Si el divisor no es mas grande que 1
		while (divisor <= 1) {
			System.out.println("Enter the divisor (greater than 1):");
			divisor = scanner.nextInt();
		}
		
		//Pedimos un valor maximo 
		System.out.println("Enter maximum value (greater than 10):");
		maxValue = scanner.nextInt();
		
		//Si el valor maximo no es mayor que 10
		while (maxValue <= 10) {
			System.out.println("Enter maximum value (greater than 10):");
			maxValue = scanner.nextInt();
		}
		
		for (int i = 1; i <= maxValue; i++) {
			if (i % divisor == 0) {
				//Si es el primer numero
				if (recordar.equals("")) {
					recordar = i + "";
				//Si no
				} else {
					recordar = recordar + ", " + i;
				}
			}
		}
		System.out.println(recordar);
	}
}