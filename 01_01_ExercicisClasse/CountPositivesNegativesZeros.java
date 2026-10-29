import java.util.Scanner;

public class CountPositivesNegativesZeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		//Variables
		int positius = 0;
		int negatius = 0;
		int zeros = 0;
		int voltes = 0;
		
		//Demanar num introduir més gran que 0
		System.out.println("How many numbers?");
		int num = scanner.nextInt();
				
		while (num <= 0) { //Pedimos hasta que salga un numero mayor a 0
			System.out.println("How many numbers?");
			num = scanner.nextInt();

		}
		//Cuando salga un numero >0 entonces la vuelta aumenta a 1
		voltes = 1;
		
		while (voltes <= num) { //Mientras las vueltas sean inferior a la cantidad de vueltas introducidas
			System.out.println("Enter number: ");
			int input = scanner.nextInt();
			voltes++;
			
			if (input > 0) {
				positius++;
			} else if (input < 0) {
				negatius++;
			} else {
				zeros++;
			}
		}
		
		System.out.println("Positive: " + positius);
		System.out.println("Negative: " + negatius);
		System.out.println("Zeros: " + zeros);
	}
}