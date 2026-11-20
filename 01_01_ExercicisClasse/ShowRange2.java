import java.util.Scanner;

public class ShowRange2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int starting = 0;
		int ending = 0;
		
		System.out.println("Enter the starting number: "); //5 (viceversa, seria 10)
		starting = scanner.nextInt();
		
		System.out.println("Enter the ending number: "); //10 (viceversa, seria 5)
		ending = scanner.nextInt();
		
		while (ending == starting) {
			System.out.println("Enter the ending number: ");
			ending = scanner.nextInt();
		}
		
		if (ending > starting) { //10 > 5
			for (int i = starting; i <= ending; i++) {
				System.out.print(i + " ");
			}
		} else { //starting > ending
			for (int i = starting; i >= ending; i--) {
				System.out.print(i + " " );
			}
		}
	}
}

/* Otra forma, actualizada
import java.util.Scanner;

public class ShowRange2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int starting = 0;
		int ending = 0;
		String imprimir = "";
		
		//Pedimos primer numero
		System.out.println("Enter the starting number:");
		starting = scanner.nextInt();
		
		//Pedimos segundo numero
		System.out.println("Enter the ending number:");
		ending = scanner.nextInt();
		
		while (ending == starting) {
		    System.out.println("Enter the ending number:");
		    ending = scanner.nextInt();
		}
		
		if (ending > starting) {
		    for (int i = starting; i <= ending; i++) { //i=3 ending=20
		        if (i == starting) {
		            imprimir = i + "";
		        } else {
		            imprimir = imprimir + " " + i;
		        }
		    }
		} else {
		    for (int i = ending; i <= starting; i++) { //i=3 starting=20
		        imprimir = i + " " + imprimir;
		    }
		}
		
		System.out.println(imprimir);
	}
} */
