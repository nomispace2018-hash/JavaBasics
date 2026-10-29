import java.util.Scanner;

public class MananaNoHayClase {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String assistencia = "";
		int noClasse = 0;
		int voltes = 0;
		int ratxa = 0;
		
		int dies = scanner.nextInt(); // 7 dies
		scanner.nextLine(); 
		
		while (voltes < dies) { //mentre les voltes siguin inferiors a els dies
			assistencia = scanner.nextLine(); //S, 
			voltes++;
			
			if (assistencia.equals("N")) { //Si es "N"
				noClasse++; //se suma 1 dia de no tener clase
				
				if (noClasse > ratxa){
					ratxa = noClasse;
				}
			
			} else {
				noClasse = 0;
			}
		}
		
		System.out.println(ratxa);
		
	}
}