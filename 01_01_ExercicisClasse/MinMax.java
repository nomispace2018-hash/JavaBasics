import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a positive double (negative number to finish): ");
		double num = scanner.nextDouble(); //1
		
		//Variables
		double max = 0;
		double min = 0;
		
		
		if (num < 0) {
			System.out.println("No numbers entered");
		} else {
			max = num; //1
			min = num; //1
			
			boolean continuar = true;
			
			while (continuar) {
				System.out.println("Enter a positive double (negative number to finish): ");
				num = scanner.nextDouble(); //5
				
				if (num < 0) { //Si el numero que han introducido es inferior a 0 (negativo)
					System.out.printf("MINIM = %.1f", min); // El maximo es el mismo número
					System.out.printf("%nMAXIM = %.1f", max); // El mínimo es el mismo número
					continuar = false;
				}
				
				//Si el numero que han introducido NO es negativo
				if (num > max) { //si 5 es mayor que 1
					max = num; // 5 es el nuevo maximo
				}
				
				if (num < min) { //si 5 es menor que 1 (no es verdad)
					min = num; //5 es el nuevo minimo
				}
			}
		}
	}
}
