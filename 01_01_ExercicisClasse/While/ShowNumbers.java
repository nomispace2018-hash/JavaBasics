import java.util.Scanner;

public class ShowNumbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter X:");
		int x = scanner.nextInt();
		
		System.out.println("Enter Y:");
		int y  = scanner.nextInt();
		
		int calcul = y - x;
		int contador = 0;
		
		while (contador <= calcul) {
			System.out.printf("%d ",x);
			x = x + 1;
			contador = contador + 1;
		}
	}
}
