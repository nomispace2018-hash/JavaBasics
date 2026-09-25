public class TripleJumpRecord {

	public static void main(String[] args) {
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		// Get new record 
		double record1 = Math.max(jump1, jump2);
		double record2 = Math.max(jump3, jump4);
		double record3 = Math.max(record1, record2);
		double newRecord = Math.max(record, record3);
		
		// Display the new record
		System.out.println("The current record is now " + newRecord + " meters");
		
		// Display the next integer value
		int intValue = (int)Math.ceil(newRecord);
		System.out.println("The current record is below " + intValue + " meters");
		
		// Display the previous integer value
		int intValue2 = (int)Math.floor(newRecord);
		System.out.println("The current record is above " + intValue2 + " meters");

	}

}