import java.util.Scanner;

public class HighestScore {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the score of the first player: ");
		int score1 = scanner.nextInt();
		
		System.out.println("Enter the score of the second player: ");
		int score2 = scanner.nextInt();
		
		System.out.println("Enter the score of the third player: ");
		int score3 = scanner.nextInt();
		
		System.out.println("Enter the score of the fourth player: ");
		int score4 = scanner.nextInt();
	
		
		if (score1 > score2 && score1 > score3 && score1 > score4) {
			System.out.println("The highest score is: " + score1);
		}
		
		else if (score2 > score1 && score2 > score3 && score2 > score4) {
			System.out.println("The highest score is: " + score2);
		}
		
		else if (score3 > score1 && score3 > score2 && score3 > score4) {
			System.out.println("The highest score is: " + score3);
		}
		
		else {
			System.out.println("The highest score is: " + score4);
		}
	
	}
}