public class Decimals {
	public static void main(String [] args) {
		
		//Redondear a 0 decimales:
		double x = 12.345679;
		int n = 0;
		double Result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + (int)Result);
		
		
		//Redondear a 2 decimales:
		n = 2;
		Result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + Result);
		
		
		//Redondear a 4 decimales:
		n = 4;
		Result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + Result);
		
		//Redondear a 6 decimales:
		n = 6;
		Result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + Result);
	}
}	