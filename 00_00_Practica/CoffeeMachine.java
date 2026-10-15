import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Monthly electricity cost: ");
		double electricity = scanner.nextDouble();
		
		System.out.println("Monthly coffee machine rental cost: ");
		double coffeeRental = scanner.nextDouble();
		
		System.out.println("Number of coffees: ");
		int coffees = scanner.nextInt();
		
		System.out.println("Average coffee price: ");
		double coffeePrice = scanner.nextDouble();
		
		System.out.println("Coffee price per kilo: ");
		double coffeeKiloPrice = scanner.nextDouble();
		
		System.out.println("Kilograms of coffee: ");
		int coffeeKilograms = scanner.nextInt();
		
		System.out.println("Milk price per litre: ");
		double milkPrice = scanner.nextDouble();
		
		System.out.println("Liters of milk: ");
		int milkLiters = scanner.nextInt();
		
		double despeses = electricity + coffeeRental + (coffeeKiloPrice * coffeeKilograms) + (milkPrice * milkLiters);
		
		double ingresos = coffeePrice * coffees;
		
		boolean buy = ingresos > despeses;
		
		System.out.println("Should we buy the coffee machine? " + buy);
		
		
	}
}