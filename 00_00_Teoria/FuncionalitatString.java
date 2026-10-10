import java.util.Scanner;

public class FuncionalitatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String frase1 = "No por mucho madrugar amanece más temprano";
        System.out.println("Frase Inicial: " + frase1);
        
        // Exercici 1: convertir la frase a majúscules
        System.out.println("-----toUpperCase-----");
        String frase2 = frase1.toUpperCase();
        System.out.println(frase2);
        
        // Exercici 2: comparar si son iguals les frases (sensible a mayúsculas/minúsculas)
        System.out.println("----equals()----");
        boolean iguals = frase1.equals(frase2);
        if (iguals) {
            System.out.println("Són iguals");
        } else {
            System.out.println("Noup");
        }
        
        // Exercici 3: compara si son iguals ignorant majúscules i minúscules
        System.out.println("----equalsIgnoreCase()----");
        iguals = frase1.equalsIgnoreCase(frase2); // Reutilizamos la variable 'iguals' sin volver a poner 'boolean'
        if (iguals) {
            System.out.println("Són iguals");
        } else {
            System.out.println("Noup");
        }
        
        // Exercici 4: comparar la longitud de dos frases diferentes
        System.out.println("----Comparar longituds----");
        
        if (frase1.length() == frase2.length()) {
            System.out.println("Són iguals");
        } else if (frase1.length() > frase2.length()) {
            System.out.println("La segunda frase es más pequeña que la primera frase");
        } else {
            System.out.println("La segunda frase es más larga que la primera frase");
        }
        
        //Ordena de menor a major les dues frases i mostra la longitud
        String paraula = "Hola";
        String paraula2 = "que tal";
        int paraulaNumero= paraula.length();
        int paraula2Numero= paraula.length();
        if (paraulaNumero > paraula2Numero){
            System.out.println(paraulaNumero + " " + paraula2Numero);
        }
        else {
            System.out.println(paraula2Numero + " " + paraulaNumero);
		}
		
		// CASO EXTRA (diferente)
		Podemos asignar una variable temporal cuyo valor luego de leer la línea se pierde.
		String frase1 = "H0laskifadskhuadshuksh";
		String frase2 = "que tal";
		int num1 = frase1.length(); //22 carácters
		int num2 = frase2.length(); //7 carácters
		
		if (num1 > num2) {
			int temp = num1;
			int num1 = num2;
			int num2 = temp;
		}
        
    }
}