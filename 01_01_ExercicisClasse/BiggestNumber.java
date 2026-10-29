import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int num = 0;
		int max = 0;
		
		//Iniciar el programa
		System.out.println("Enter positive numbers. Enter a negative number to finish: ");
		num = scanner.nextInt();
		
		if (num < 0) {
			System.out.println("No positive numbers were entered");
		} else {
			max = num;
			
			boolean continuar = true;
			
			while (continuar) {
				num = scanner.nextInt();
				
				if (num > max) {
					max = num;
				}
				
				if (num < 0) {
					System.out.println("The biggest number is: " + max);
					continuar = false;
				}
			}
		}
	}
}