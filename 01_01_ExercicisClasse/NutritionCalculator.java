import java.util.Scanner;

public class NutritionCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nutrition calculator:");
		System.out.println("1. Calculate calories");
		System.out.println("2. Calories per serving");
		System.out.println("3. Daily calories");
		
		System.out.println("Choose an option:");
		int option = scanner.nextInt();
		
		//VARIABLES BÀSIQUES
		double protein, carbo, fat, calories100, pesRacio, weight, activityFactor;
		int age, height;
		String sex;
		
		switch (option) {
			case 1: //OPCIO 1
				System.out.println("Enter protein (g):");
				protein = scanner.nextDouble();
				
				System.out.println("Enter carbohydrates (g):");
				carbo = scanner.nextDouble();
				
				System.out.println("Enter fat (g):");
				fat = scanner.nextDouble();
				
				double proteinKCAL = protein * 4;
				double carboKCAL = carbo * 4;
				double fatKCAL = fat * 9;
				double calories = proteinKCAL + carboKCAL + fatKCAL;
				
				System.out.printf("Total calories: %.2f kcal%n", calories);
				break;
			case 2: //OPCIO 2
				System.out.println("Enter calories per 100 g:");
				calories100 = scanner.nextDouble();
				
				System.out.println("Enter serving size (g):");
				pesRacio = scanner.nextDouble();
				
				double caloriesRacion = (calories100 * pesRacio) / 100;
				
				System.out.printf("Calories per serving: %.2f kcal%n", caloriesRacion);
				break;
			default: //OPCIO 3
				System.out.println("Enter age (years):");
				age = scanner.nextInt();
				
				System.out.println("Enter height (cm):");
				height = scanner.nextInt();
				
				System.out.println("Enter weight (kg):");
				weight = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("Enter sex (M/F):");
				sex = scanner.nextLine();
				
				System.out.println("Enter activity factor (1.2 to 1.9):");
				activityFactor = scanner.nextDouble();
				
				double tdeeMen = (10 * weight + 6.25 * height - 5 * age + 5) * activityFactor;
				double tdeeWomen = (10 * weight + 6.25 * height - 5 * (int)age - 161) * activityFactor;
				
				switch (sex.toUpperCase()) {
					case "M": //Home
						System.out.printf("Daily calories: %.2f kcal%n", tdeeMen);
						break;
					default: //Dona
						System.out.printf("Daily calories: %.2f kcal%n", tdeeWomen);
					break;
				}
				break;
		}
	}
}