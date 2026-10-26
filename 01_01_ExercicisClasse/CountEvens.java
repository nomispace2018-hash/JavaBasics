import java.util.Scanner;

public class CountEvens {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = scanner.nextInt();
		int parell = 0;
		String quantParells = "";
		
		while (num != -1) {
			
			if (num % 2 == 0) {
				parell++;
				
				if (quantParells.equals("")) {
					quantParells += num;
				} else {
					quantParells = quantParells + " " + num;
				}
			}
			
			System.out.println("Enter number:");
			num = scanner.nextInt();
		}
		
		System.out.println("Even numbers: " + parell);
		System.out.println("Numbers: " + quantParells);
	}
}