import java.util.Scanner; 

public class TemperatureConversion {
    public static void main(String[] args) {
        
        Scanner scanner;
        scanner = new Scanner(System.in);
		
		System.out.println("Enter temperature in Celsius: ");
		double C = scanner.nextDouble();
		
		double F = C * 9 / 5 + 32;
		System.out.printf("Fahrenheits = %.2f", F);
	}
}