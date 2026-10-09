import java.util.Scanner;

public class Podium {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the score of the first athlete: ");
		int score1 = scanner.nextInt();
		
		System.out.println("Enter the score of the second athlete: ");
		int score2 = scanner.nextInt();
		
		System.out.println("Enter the score of the third athlete: ");
		int score3 = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter \"asc\" or \"desc\": ");
		String response = scanner.nextLine().toLowerCase();
		
		if (response.equals ("asc")) {
			if (score1 >= score2 && score2 >= score3) {
				System.out.println("Podium: " + score3 + " " + score2 + " " + score1);
				
			} else if (score1 >= score3 && score3 >= score2) {
				System.out.println("Podium: " + score2 + " " + score3 + " " + score1);
				
			} else if (score2 >= score1 && score1 >= score3) {
				System.out.println("Podium: " + score3 + " " + score1 + " " + score2);
				
			} else if (score2 >= score3 && score3 >= score1) {
				System.out.println("Podium: " + score1 + " " + score3 + " " + score2);
			
			} else if (score3 >= score1 && score1 >= score2) {
				System.out.println("Podium: " + score2 + " " + score1 + " " + score3);
		
			} else if (score3 >= score2 && score2 >= score1) {
				System.out.println("Podium: " + score1 + " " + score2 + " " + score3);
			}
		} else {
			if (score1 >= score2 && score2 >= score3) {
				System.out.println("Podium: " + score1 + " " + score2 + " " + score3);
				
			} else if (score1 >= score3 && score3 >= score2) {
				System.out.println("Podium: " + score1 + " " + score3 + " " + score2);
				
			} else if (score2 >= score1 && score1 >= score3) {
				System.out.println("Podium: " + score2 + " " + score1 + " " + score3);
				
			} else if (score2 >= score3 && score3 >= score1) {
				System.out.println("Podium: " + score2 + " " + score3 + " " + score1);
			
			} else if (score3 >= score1 && score1 >= score2) {
				System.out.println("Podium: " + score3 + " " + score1 + " " + score2);
		
			} else if (score3 >= score2 && score2 >= score1) {
				System.out.println("Podium: " + score3 + " " + score2 + " " + score1);
			}
		}
	}
}