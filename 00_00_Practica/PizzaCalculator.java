import java.util.Scanner;

public class PizzaCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the diameter of the first pizza (cm):");
		int diam1 = scanner.nextInt();
		System.out.println("Enter the diameter of the second pizza (cm):");
		int diam2 = scanner.nextInt();
		System.out.println("Enter the diameter of the third pizza (cm):");
		int diam3 = scanner.nextInt();
		
		if (diam1 == diam2 && diam2 == diam3) {
			System.out.println("All pizzas have the same size");
		} else if (diam1 == diam2 || diam1 == diam3 || diam2 == diam3) {
			System.out.println("Two pizzas have the same size");
		} else {
			System.out.println("All pizzas have different sizes");
		}
	}
}