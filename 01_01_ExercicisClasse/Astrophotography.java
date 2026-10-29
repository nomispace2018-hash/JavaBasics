import java.util.Scanner;

public class Astrophotography {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int space = 0;
		int battery = 0;
		int humidity = 0;
		int velocity = 0;
		boolean externalPower;
		boolean prepared;
		
		System.out.println("Free space in MB: ");
		space = scanner.nextInt();
		
		System.out.println("Battery level in %: ");
		battery = scanner.nextInt();
		
		System.out.println("Humidity in %: ");
		humidity = scanner.nextInt();
		
		System.out.println("Wind speed in km/h: ");
		velocity = scanner.nextInt();
		
		System.out.println("Connected to external power (true/false): ");
		externalPower = scanner.nextBoolean();
		
		prepared = (space >= 250) && (battery >= 20 || externalPower == true) && (humidity < 60) && (velocity < 10);
		
		System.out.println("Ready to take photo: " + prepared);
		
	}
}