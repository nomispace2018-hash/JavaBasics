import java.util.Scanner;

public class SwitchCaseTernari {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quin dia de la setmana és avui? (1/7)");
		int nDia = scanner.nextInt();
		scanner.nextLine();
		
		//Otra forma de utilizar un "if" es con un "switch". Estos solo admiten hacer comparaciones simples (ej. "es igual a 1?", "es igual a 30?", nada complejo con >< && ||).
		switch (nDia) { //ESTO SE LLAMA "SELECTOR"
			case 1: //Indica que si "nDia" tiene como valor el número 1 entonces hace lo que hay abajo.
				System.out.println("Dilluns");
				break; //Para romper el sistema/condición una vez se cumple el caso/condición 1.
			case 2:
				System.out.println("Dimarts");
				break;
			case 3:
				System.out.println("Dimecres");
				break;
			case 4:
				System.out.println("Dijous");
				break;
			case 5:
				System.out.println("Divendres");
				break;
			case 6:
				System.out.println("Dissabte");
				break;
			case 7:
				System.out.println("Diumenge");
				break;
			default:
				System.out.println("Dia desconegut");
				break;
		}
		
		System.out.println("---");
		
		//Podemos agrupar las condiciones.
		switch (nDia) {
			case 1, 2, 3, 4, 5: //Si el dia es 1, 2, 3, 4 o 5:
				System.out.println("És un dia de la setmana"); //Es un dia de la setmana
				break;
			case 6, 7: //Si el dia es 6 o 7:
				System.out.println("És un dia del cap de setmana");
				break;
			default:
				System.out.println("Dia desconegut");
				break;
		}
			
		System.out.println("---");
		
		//Podemos usar el switch de otra forma también
		System.out.println("Quin dia de la setmana és avui? (en paraules)");
		String dia = scanner.nextLine();
		dia = dia.toLowerCase(); //Lo pasamos a mínusculas para aceptar cualquier entrada
		
		int nDia2 = switch (dia) {
			case "dilluns" -> 1;
			case "dimarts" -> 2;
			case "dimecres" -> 3;
			case "dijous" -> 4;
			case "divendres" -> 5;
			case "dissabte" -> 6;
			case "diumenge" -> 7;
			default -> 0;
		}; //SE CIERRA ASÍ, SIN BREAK
		
		System.out.println("Número de dia: " + nDia2);
		System.out.println("---");
		
		//Podemos usar el switch con flechas de esta forma también
		int nDia2 = 0;
		
		switch (dia) {
			case "dilluns" -> {
				nDia = 1;
				System.out.println("Se pueden abrir parentesis en los switch con flechas, jaja");
			}
			case "dimarts" -> 2;
			case "dimecres" -> 3;
			case "dijous" -> 4;
			case "divendres" -> 5;
			case "dissabte" -> 6;
			case "diumenge" -> 7;
			default -> 0;
		};
		System.out.println("Número de dia: " + nDia2);
		System.out.println("---");
		
		//Podemos usar operadores "ternarios" también
		String tipusDia = (nDia>=1 && nDia<=5)?
			"laborable": "festiu"; //Si se cumple la condición de que el día está entre 1 y 5, es "laborable", si no, es "festivo".
		System.out.println("Avui és: " + tipusDia);
		
		/*Así se veria con una condición tipo "if else":
		---
		if (nDia == 1) {
			System.out.println("Dilluns");
		} else if (nDia == 2) {
			System.out.println("Dimarts");
		} else if (nDia == 3) {
			System.out.println("Dimecres");
		} else {
			System.out.println("Dia desconegut");
		}
		---
		if (nDia>=1 && nDia<=5) {
			System.out.println("És un dia laborable.");
		} else {
			System.out.println("És un dia festiu.");
		}*/
		
		
	}
}
