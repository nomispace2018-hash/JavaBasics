public class PrintFormat {
	public static void main(String[] args) {
		
		String name = "Alice";
		int age = 25;
		double height = 1.82678;
		double grade = 8.756;
		String subject = "Mathematics";
		
		System.out.printf("%nName: %s", name);
		System.out.printf("%nAge: %d years old", age);
		System.out.printf("%nHeight: %.2f meters", height);
		System.out.printf("%nGrade in %S: %.1f", subject, grade);
		
	}
}