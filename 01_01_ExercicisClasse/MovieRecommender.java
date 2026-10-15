import java.util.Scanner;

public class MovieRecommender {
	public static void main(String[] args) {
		//START
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Movie Recommender!");
		
		//Action Movies
		System.out.println("Do you like action movies? (yes/no):");
		String action = scanner.nextLine();
		
		if (action.equalsIgnoreCase("yes")) { //YES
			System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
			String genre = scanner.nextLine();
			
			if (genre.equalsIgnoreCase("superhero")) { //Superhero
				System.out.println("You should watch 'Avengers: Endgame'.");
			} else if (genre.equalsIgnoreCase("spy")) { //Spy
				System.out.println("You should watch 'Mission: Impossible Fallout'.");
			} else { //Other
				System.out.println("You should watch 'Mad Max: Fury Road'.");
			}
		} else { //NO
			//Comedy Movie
			System.out.println("Do you like comedies? (yes/no):");
			String comedies = scanner.nextLine();
		
			if (comedies.equalsIgnoreCase("yes")) { //YES
				//Humor Movies
				System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
				String humor = scanner.nextLine();
		
				if (humor.equalsIgnoreCase("smart")) {
					System.out.println("You should watch 'The Grand Budapest Hotel'.");
				} else if (humor.equalsIgnoreCase("silly")) {
					System.out.println("You should watch 'The Hangover'.");
				} else {
					System.out.println("You should watch 'The Mask'.");
				}
			} else { //NO
				//Independent films
				System.out.println("Do you like independent films? (yes/no):");
				String independent = scanner.nextLine();
				
				if (independent.equalsIgnoreCase("yes")) { //YES
					//Drama or Experimental
					System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
					String genre2 = scanner.nextLine();
					
					if (genre2.equalsIgnoreCase("drama")) { //drama
						System.out.println("You should watch 'Lady Bird'.");
					} else if (genre2.equalsIgnoreCase("experimental")) { //experimental
						System.out.println("You should watch 'Everything Is Illuminated'.");
					} else { //other
						System.out.println("You should watch 'Moonlight'.");
					}
				} else { //NO
					System.out.println("You should watch 'Home Alone'.");
				}
			}
		}
			
		//FINISH
		System.out.println("Thanks for using the Movie Recommender!");
	}
}