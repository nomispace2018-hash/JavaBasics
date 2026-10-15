public class ParkingGratis {

	public static void main(String[] args) {

		boolean gratis = false;
		
		// El pàrquing és gratuït si:
		// - 60 minuts o menys de dilluns a divendres per tot tipus de clients
		// - És membre i té 65 anys o més
		// - És cap de setmana, és membre i està 120 minuts o menys
		
		float minutes = 65;
		int age = 67;
		boolean weekEnd = true;
		boolean member = false;

		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		// true && false || false && true || false && true && true
		// false || false || false
		System.out.println("result = " + ( gratis == false ));
		
		minutes = 36;
		age = 65;
		weekEnd = false;
		member = true;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		// true && true || true && true || true && false && true
		// true || true || false
		// true || false
		// true
		System.out.println("result = " + ( gratis == true ));
		
		minutes = 115;
		age = 34;
		weekEnd = false;
		member = true;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		// false && true || true && false || true && false && true
		// false || false || false
		// false
		System.out.println("result = " + ( gratis == false ));
		
		minutes = 120;
		age = 34;
		weekEnd = true;
		member = true;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		// false && false || true && false || true && true && true
		// false || false || true
		// false || true
		// true
		System.out.println("result = " + ( gratis == true ));
		
		minutes = 130;
		age = 25;
		weekEnd = false;
		member = false;
		
		gratis = minutes <= 60 && !weekEnd || member && age >= 65 || member && weekEnd && minutes <= 120;		
		// false && true || false && false || false && false && false
		// false || false || false
		// false
		System.out.println("result = " + ( gratis == false ));
		
	}

}