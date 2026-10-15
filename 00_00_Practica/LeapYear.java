import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			boolean leap = true;
			System.out.println(leap);
		} else {
			boolean leap = false;
			System.out.println(leap);
		}
	}
}