import java.util.Scanner;

public class FilmDuration {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Frames per second (fps):");
		int fps = scanner.nextInt();
		
		System.out.println("Duration of film in minutes:");
		int duration = scanner.nextInt();
		int durationSec = duration * 60;
		scanner.nextLine();
		
		System.out.println("Name of the film:");
		String name = scanner.nextLine();
		
		int totalFrames = fps * durationSec;
		
		System.out.printf("Total frames of film \"%s\" is %d", name, totalFrames);
		
		
		
	}
}