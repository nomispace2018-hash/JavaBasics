import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quin dia de la setmana és avui?");
		String dia = scanner.nextLine();
		
		switch (dia.toLowerCase()) {
			case "dilluns": 
				System.out.println("1");
				break;
			case "dimarts":
				System.out.println("2");
				break;
			default:
				System.out.println("Dia desconegut");
				break;
		}
	}
}