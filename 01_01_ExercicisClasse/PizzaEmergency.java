import java.util.Scanner;

public class PizzaEmergency {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter pizza diameter:");
		int pizza = scanner.nextInt();
		
		String text = (pizza >= 30) ? ("Pizza for everyone!") : ("You might need another pizza!");
		System.out.println(text);
		
	}
}