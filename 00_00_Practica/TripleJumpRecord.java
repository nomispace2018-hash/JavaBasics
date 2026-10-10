public class TripleJumpRecord {
	public static void main(String[] args) {
		
		double record = 18.29;
		
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
		
		double maxRec1  = Math.max(jump1, jump2);
		double maxRec2 = Math.max(jump3, jump4);
		double maxRec3 = Math.max(maxRec1, maxRec2);
		double maxRecord = Math.max(record, maxRec3);
		
		System.out.println("The current record is now " + maxRecord + " meters");
		
		int ceilRec = (int)Math.ceil(maxRecord);
		System.out.println("The current record is below " + ceilRec + " meters");
		
		int floorRec = (int)Math.floor(maxRecord);
		System.out.println("The current record is above " + floorRec + " meters");
		
		
		
	}
}