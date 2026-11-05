import java.util.Scanner;

public class TotalSumOfCards {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int cartaPlayer1 = 0;
		int cartaPlayer2 = 0;
		int sumaCartesPlayer1 = 0;
		int sumaCartesPlayer2 = 0;
		
		//Demanem cartes jugador 1
		System.out.println("PLAYER 1");
		
		for (int i = 1; i < 5; i++) {
			System.out.printf("Enter the value of card %d for player 1:%n", i);
			cartaPlayer1 = scanner.nextInt();
			
			//Si el valor NO esta entre 1 i 12 
			while (cartaPlayer1 < 1 || cartaPlayer1 >12) {
				System.out.println("Wrong card, please enter 1..12:");
				cartaPlayer1 = scanner.nextInt();
			}
			
			//Si el valor esta entre 1 i 12
			sumaCartesPlayer1 = sumaCartesPlayer1 + cartaPlayer1;
		}
		
		//Demanem cartes jugador 2
		System.out.printf("%nPLAYER 2%n");
		
		for (int x = 1; x < 5; x++) {
			System.out.printf("Enter the value of card %d for player 2:%n", x);
			cartaPlayer2 = scanner.nextInt();
			
			//Si el valor NO esta entre 1 i 12 
			while (cartaPlayer2 < 1 || cartaPlayer2 > 12) {
				System.out.println("Wrong card, please enter 1..12:");
				cartaPlayer2 = scanner.nextInt();
			}
			
			//Si el valor esta entre 1 i 12
			sumaCartesPlayer2 = sumaCartesPlayer2 + cartaPlayer2;
		}
		
		System.out.printf("%nRESULTS%n");
		System.out.println("Total cards Player 1: " + sumaCartesPlayer1);
		System.out.println("Total cards Player 2: " + sumaCartesPlayer2);
		
		if (sumaCartesPlayer1 > sumaCartesPlayer2) {
			System.out.println("Player 1 has won!");
		} else if (sumaCartesPlayer2 > sumaCartesPlayer1) {
			System.out.println("Player 2 has won!");
		} else {
			System.out.println("It is a draw.");
		}
	}
}
