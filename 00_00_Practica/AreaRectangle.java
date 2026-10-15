import java.util.Scanner;

public class AreaRectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side A: ");
		double sideA = scanner.nextDouble();
		System.out.println("Enter side B: ");
		double sideB = scanner.nextDouble();
		System.out.println("Enter units: ");
		scanner.nextLine();
		String units = scanner.nextLine();
		double area = sideA * sideB;
		
		System.out.println("Area = " + area + " " + units + "^2");
		
	}
}
