import java.util.Scanner;

public class GradeClassification {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numeric grade (0-100): ");
		int grade = scanner.nextInt();
		
		if (grade < 0) {
			System.out.println("Invalid grade");
		} else if (grade <= 49) {
			System.out.println("F = Fail");
		} else if (grade <= 59) {
			System.out.println("D = Pass");
		} else if (grade <= 69) {
			System.out.println("C = Satisfactory");
		} else if (grade <= 89) {
			System.out.println("B = Good");
		} else if (grade >= 90 && grade <= 100) {
			System.out.println("A = Excellent");
		} else {
			System.out.println("Invalid grade");
		}
	}
}