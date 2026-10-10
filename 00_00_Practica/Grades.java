public class Grades {
	public static void main(String[] args) {
		
		float grade1 = 7.7f;
		float grade2 = 6.4f;
		float grade3 = 7.2f;
		
		float highest1And2 = (float)Math.max(grade1, grade2);
		float highestGrade = (float)Math.max(highest1And2, grade3);
		int finalGrade = (int)Math.round(highestGrade);
		System.out.println("Highest grade: " + highestGrade);
		System.out.println("Final grade: " + finalGrade);
		
	}
}