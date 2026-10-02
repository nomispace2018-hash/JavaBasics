import java.util.Scanner; 

public class BodyWeight {
    public static void main(String[] args) {
		
        // Constants
        final byte K_MEN = 4;
        final float K_WOMEN = 2.5f;

        // Create the Scanner
		Scanner scanner;
        scanner = new Scanner(System.in);

        // Request the input  (2 integers)
		System.out.println("Enter your height in cm: ");
		double H = scanner.nextDouble();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
        // Calculate the body weight for men
		double menWeight = H - 100 - (H - 150) / 4.0 + (age -20.00) / K_MEN;

        // Display the body weight for men
		System.out.printf("Ideal Body Weight for Men = %.2fkg%n", menWeight);

        // Calculate the body weight for women
		double womenWeight = H - 100 - (H - 150) / 4 + (age -20) / K_WOMEN;

        // Display the body weight for women
		System.out.printf("Ideal Body Weight for Women = %.2fkg%n", womenWeight);


        // Close the Scanner
    }

}