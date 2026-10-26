import java.util.Scanner;

public class IncreasingSequence {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		
		int remember = num;
		
		String sequencia = "" + num;
		
		System.out.println("Enter number: ");
		num = scanner.nextInt();
		
		while (!(num <= remember)) {
			sequencia+= " " + num;
			remember = num;
			
			System.out.println("Enter number: ");
			num = scanner.nextInt();
		}
		
		System.out.println("Sequence: " + sequencia);
		
	}
}