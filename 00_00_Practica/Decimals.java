public class Decimals {
	public static void main(String[] args) {
		
		double x = 12.3456789;
		//0 decimals
		int n = 0;
		double result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		int resultFinal = (int)result;
		System.out.println("Rounded to " + n + " decimals: " + resultFinal);
		
		//2 decimals
		n = 2;
		result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + result);
		
		//4 decimals
		n = 4;
		result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + result);
		
		//6 decimals
		n = 6;
		result = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + result);
		
		
	}
}