import java.util.Scanner;

public class Scanner_Ex1 {
	public static void main(String [] args) {
		
		Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Enter first price: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second price: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third price: ");
        int num3 = scanner.nextInt();
		
        System.out.println("Enter fourth price: ");
        int num4 = scanner.nextInt();
		
        System.out.println("Enter fifth price: ");
        int num5 = scanner.nextInt();

		int total = num1 + num2 + num3 + num4 + num5;
		double average = (double)total/5;
		System.out.println("Total price: " + total);
		System.out.println("Average: " + average);

	}
}