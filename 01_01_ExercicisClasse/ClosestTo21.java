import java.util.Scanner;

public class ClosestTo21 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int cartaPlayer1 = 0;
		int cartaPlayer2 = 0;
		int sumaCartesPlayer1 = 0;
		int sumaCartesPlayer2 = 0;
		
		//Demanem cartes jugador 1
		System.out.println("PLAYER 1");
		
		for (int i = 1; i < 4; i++) {
			System.out.printf("Enter the value of card %d (1-12):%n", i);
			cartaPlayer1 = scanner.nextInt();
			
			//Si el valor NO esta entre 1 i 12 
			while (cartaPlayer1 < 1 || cartaPlayer1 >12) {
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				cartaPlayer1 = scanner.nextInt();
			}
			
			//Si el valor esta entre 1 i 12
			sumaCartesPlayer1 = sumaCartesPlayer1 + cartaPlayer1;
		}
		
		System.out.println("Total for Player 1: " + sumaCartesPlayer1);
		
		if (sumaCartesPlayer1 > 21) {
			System.out.println("Player 1 went over 21 and is eliminated!");
		}
		
		//Demanem cartes jugador 2
		System.out.printf("%nPLAYER 2%n");
		
		for (int x = 1; x < 4; x++) {
			System.out.printf("Enter the value of card %d (1-12):%n", x);
			cartaPlayer2 = scanner.nextInt();
			
			//Si el valor NO esta entre 1 i 12 
			while (cartaPlayer2 < 1 || cartaPlayer2 > 12) {
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				cartaPlayer2 = scanner.nextInt();
			}
			
			//Si el valor esta entre 1 i 12
			sumaCartesPlayer2 = sumaCartesPlayer2 + cartaPlayer2;
		}
		
		System.out.println("Total for Player 2: " + sumaCartesPlayer2);
		
		if (sumaCartesPlayer2 > 21) {
			System.out.println("Player 2 went over 21 and is eliminated!");
		}
		
		System.out.printf("%nFINAL RESULT");
		//Si los dos superan 21
		if (sumaCartesPlayer1 > 21 && sumaCartesPlayer2 > 21) {
			System.out.printf("%nBoth players went over 21. No winner!");
		//Si el jugador 1 supera 21
		} else if (sumaCartesPlayer1 > 21) {
			System.out.printf("%nPlayer 2 wins");
		//Si el jugador 2 supera 21
		} else if (sumaCartesPlayer2 > 21) {
			System.out.printf("%nPlayer 1 wins");
		//Si gana el jugador 1 y ambos son validos
		} else if (sumaCartesPlayer1 > sumaCartesPlayer2) {
			System.out.printf("%nPlayer 1 wins with %d points!", sumaCartesPlayer1);
		//Si gana el jugador 2 y ambos son validos
		} else if (sumaCartesPlayer2 > sumaCartesPlayer1) {
			System.out.printf("%nPlayer 2 wins with %d points!", sumaCartesPlayer2);
		//Si los dos empatan
		} else {
			System.out.printf("%nIt's a draw! Both have %d points", sumaCartesPlayer1);
		}					
	}
}