import java.util.Scanner;

public class BodyWeight {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final byte K_MEN = 4;
		final float K_WOMEN = 2.5f;
		
		System.out.println("Enter your height in cm:" );
		int H = scanner.nextInt();
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		double W_MEN = (double)H - 100 - (((double)H - 150) / 4) + (((double)age - 20) / (double)K_MEN);
		double W_WOMEN = (double)H - 100 - (((double)H - 150) / 4) + (((double)age - 20) / (double)K_WOMEN);
		
		System.out.printf("Ideal Body Weight for Men = %.2fkg", W_MEN);
		System.out.printf("%nIdeal Body Weight for Women = %.2fkg", W_WOMEN);
		
	}
}