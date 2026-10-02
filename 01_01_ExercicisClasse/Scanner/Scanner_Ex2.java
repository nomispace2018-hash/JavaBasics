import java.util.Scanner;

public class Scanner_Ex2 {
	public static void main(String [] args) {
		
		Scanner scanner;
        scanner = new Scanner(System.in);
		
		System.out.println("Enter first temp: ");
        float temp1 = scanner.nextFloat();

		System.out.println("Enter second temp: ");
        float temp2 = scanner.nextFloat();

		System.out.println("Enter third temp: ");
        float temp3 = scanner.nextFloat();
		
		System.out.println("Enter fourth temp: ");
        float temp4 = scanner.nextFloat();
		
		System.out.println("Enter fifth temp: ");
        float temp5 = scanner.nextFloat();
		
		double max1 = Math.max(temp1, temp2);
		double max2 = Math.max(temp3, temp4);
		double max3 = Math.max(max1, max2);
		double maxTotal = Math.max(max3, temp5);
		
		double min1 = Math.min(temp1, temp2);
		double min2 = Math.min(temp3, temp4);
		double min3 = Math.min(min1, min2);
		double minTotal = Math.min(min3, temp5);
		
		System.out.printf("Max: %.1f %n", maxTotal);
		System.out.println("Min: " + minTotal);
	}
}