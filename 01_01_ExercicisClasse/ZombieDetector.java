import java.util.Scanner;

public class ZombieDetector {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter body temperature:");
		double temperature = scanner.nextDouble();
		
		String text = (temperature < 30) ? ("Zombie detected!") : ("Human detected!");
		System.out.println(text);
		
	}
}