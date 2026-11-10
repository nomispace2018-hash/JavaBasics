import java.util.Scanner;

public class ElCuadradoDelCinco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
      
     	//Variables
     	int casos = 0;
     	long n = 0;
     	long k = 0;
     	long calcul = 0;
		
		//Leemos cuantos casos hay
		casos = scanner.nextInt();
		
		//Iteramos tantas veces como casos haya
		for (int i = 0; i < casos; i++) {
			n = scanner.nextLong();
			
     		if (n == 5) {
     			System.out.println("25");
     		} else {
     			//Quitamos el ultimo digito (el 5) dividiendo entre 10
				k = n / 10;
			
				//Calculamos y mostramos directamente
				calcul = k * (k + 1);
				System.out.println(calcul + "25");
     		}
		}
	}
}