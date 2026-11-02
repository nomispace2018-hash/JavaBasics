import java.util.Scanner;

public class CodeDecoder {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int secretCode = 0;		
		int ultimDigit = 0;
		String lletra;
		String cadena = "";
		
		while (secretCode <= 0) {
			System.out.println("Enter secret code > 0: ");
			secretCode = scanner.nextInt();
		}
		
		while (secretCode > 0) {
			//Obtenim ultim dígit
			ultimDigit = secretCode % 10;	
			
			//Convertim nom a la seva corresponent lletra
			switch (ultimDigit) {
				case 1 -> lletra = "I";
				case 2 -> lletra = "Z";
				case 3 -> lletra = "E";
				case 4 -> lletra = "A";
				case 5 -> lletra = "S";
				case 6 -> lletra = "G";
				case 7 -> lletra = "T";
				case 8 -> lletra = "B";
				case 9 -> lletra = "P";
				default -> lletra = "O";
			}
			
			//Afegim la lletra a una cadena de text
			cadena = lletra + cadena;
			
			//Eliminem ultim dígit del nombre original
			secretCode = secretCode / 10;
		}
		
		System.out.println("Decoded message: " + cadena);
	}
}
		
		