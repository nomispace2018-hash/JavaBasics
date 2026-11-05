import java.util.Scanner;

public class Dummy {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int divisor = 0;
		int maxValue = 0;
		int divisibles = 0;
		
		System.out.println("Enter the divisor (greater than 1):");
		divisor = scanner.nextInt();
		
		//Si el divisor es menor que 1 (o igual) vuelve a pedir el numero
		while (divisor <= 1) { //3
			System.out.println("Enter the divisor (greater than 1):");
			divisor = scanner.nextInt();
		}
		
		System.out.println("Enter maximum value (greater than 10):");
		maxValue = scanner.nextInt();
		
		//Si el valor es menor que 10 (o igual) vuelve a pedir el numero
		while (maxValue <= 10) { //100
			System.out.println("Enter maximum value (greater than 10):");
			maxValue = scanner.nextInt();
		}
			
		for (int i = 1; i <= maxValue; i++) { //1<100,
			if ((i % divisor) == 0) { 
			
				if (i + divisor > maxValue) {
					System.out.print(i); // Es el último, sin coma
				} else {
					System.out.print(i + ", "); // Hay más, con coma
				}
			}
		}
	}
}