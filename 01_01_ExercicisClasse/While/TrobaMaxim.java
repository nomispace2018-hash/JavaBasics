import java.util.Scanner;

public class TrobaMaxim {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdueix un valor ");
		int valor = scanner.nextInt();
		int max = 0;
		
		while (valor >= 0) {
			if (valor > max) {
				max = valor;
			}
			
			System.out.println("Introdueix un valor ");
			valor = scanner.nextInt();
			
		}
		
		System.out.println("El màxim és " + max);
		
	}
}	