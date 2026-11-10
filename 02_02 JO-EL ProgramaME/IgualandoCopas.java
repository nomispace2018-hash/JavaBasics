import java.util.Scanner;

public class IgualandoCopas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Leemos el primer número de copas (n)
		int n = scanner.nextInt();
		
		//El bucle se repite mientras n sea diferente de 0
		while (n != 0) {
			
			long maximo = 0; //para guardar la copa con mas líquido
			long suma = 0; //para acumular la suma de todas las copas
			
			//Recorremos las n copas leyendo sus valores uno a uno al vuelo
			for (int i = 0; i < n; i++) {
				long copaActual = scanner.nextLong();
				
				//Sumamos el valor de la copa actual al total
				suma = suma + copaActual;
				
				//Si esta copa es mayor que nuestro máximo actual, actualizamos el máximo
				if (copaActual > maximo) {
					maximo = copaActual;
				}
			}
			
			//(n * el valor máximo) - la suma de todas las copas
			long totalLiquido = (n * maximo) - suma;
			
			System.out.println(totalLiquido);
			
			//Leemos el siguiente n para ver si hay mas casos o si llega el 0 para acabar con el codigo
			n = scanner.nextInt();
		}
	}
}