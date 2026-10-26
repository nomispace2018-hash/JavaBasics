import java.util.Scanner;

public class CountNumber2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number > 0: ");
		int x = scanner.nextInt();
		int contador = 0;
		int num = 0;
		int repetits = 0;
		
		while (x <= 0) {
			System.out.println("Enter number > 0: ");
			x = scanner.nextInt();
		}
		
		while (x > 0 && contador < 10) {
			System.out.println("Enter number: ");
			num = scanner.nextInt();
			contador++;
			
			if (num == x) {
				repetits++;
			}
		}
		
		System.out.println("Count: " + repetits);
	}
}