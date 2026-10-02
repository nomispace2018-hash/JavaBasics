import java.util.Scanner; 

public class AreaCircle {
    public static void main(String[] args) {
        
        Scanner scanner;
        scanner = new Scanner(System.in);
		
		double A = Math.PI;
		
		System.out.println("Enter radius: ");
		double radius = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter units: ");
		String units = scanner.nextLine();
		
		double area = A * Math.pow(radius, 2);
		System.out.println("Area = " + area + " " + units + "^2");
	}
}
		