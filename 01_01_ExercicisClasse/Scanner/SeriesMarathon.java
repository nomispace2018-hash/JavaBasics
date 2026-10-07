import java.util.Scanner;

public class SeriesMarathon{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter episode 1 duration: ");
		int ep1 = scanner.nextInt();
		
        System.out.println("Enter episode 2 duration: ");
		int ep2 = scanner.nextInt();
		
        System.out.println("Enter episode 3 duration: ");
		int ep3 = scanner.nextInt();
		
        System.out.println("Enter episode 4 duration: ");
		int ep4 = scanner.nextInt();
		
        System.out.println("Enter episode 5 duration: ");
		int ep5 = scanner.nextInt();
		
		int total = (ep1 + ep2 + ep3 + ep4 + ep5) + (10*4);
		
		int hora = total / 60;
		int min = total % 60;
		
		System.out.println("Total time: " + hora + " hours and " + min + " minutes");
	}
}