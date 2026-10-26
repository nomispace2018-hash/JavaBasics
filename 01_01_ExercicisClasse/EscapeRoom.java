import java.util.Scanner;

public class EscapeRoom {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Enter number of keys:");
		int keys = scanner.nextInt();
		
		System.out.println("Final riddle solved? (true/false)");
		boolean riddle = scanner.nextBoolean();
		
		String text2 = (riddle == true) ? ("Door unlocked! Escape successful!") : ("Door unlocked! Still trapped!");

		String text = (keys < 3) ? ("Not enough keys! Still trapped!") : text2;
		
		System.out.println(text);
		
		
		
	}
}