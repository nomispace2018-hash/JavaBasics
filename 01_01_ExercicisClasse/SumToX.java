import java.util.Scanner;

public class SumToX {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number > 10: ");
		int x = scanner.nextInt();
		
		int voltes = 1;
		
		while (x <= 10) {
			System.out.println("Enter number > 10: ");
			x = scanner.nextInt();
		}
		
		int enter = x;
		
		while (voltes <= x) { //a. recorregut creixent 1----->15 voltes++
							  //b. x--; decreixent 15 14 13 12 11...1
			//voltes++;
			x--;
			enter += x;
		}
		
		System.out.println("Total = " + enter);
	}
}