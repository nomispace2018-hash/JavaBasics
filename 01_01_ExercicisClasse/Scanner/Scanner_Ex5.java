import java.util.Scanner;

public class Scanner_Ex5 {
	public static void main(String [] args) {
		
		Scanner scanner;
        scanner = new Scanner(System.in);
		
		System.out.println("Enter the base: ");
        String base = scanner.nextLine();
		double a = Double.parseDouble(base);
		
		System.out.println("Enter the exponent: ");
        String exponent = scanner.nextLine();
		int b = Integer.parseInt(exponent);
		
		double resultat = Math.pow(a,b);
		
		System.out.printf("%.1f^%d = %.4f", a, b, resultat);
		
	}
}
