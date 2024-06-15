package _01_Encapsulate_the_Data;

public class EncapsulateTheData {
	private int itemsReceived;
	private double degreesTurned;
	private String nomenclature;
	private Object memberObj;
	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */
	public void setItemsReceived(int i) {
		if (i < 0) {
			itemsReceived = 0;
		}else {
			itemsReceived = i;	
		}
	}
	public int getItemsReceived() {
		return itemsReceived;
	}

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */
	public void setDegreesTurned(double i) {
		if (i < 0) {
			degreesTurned = 0;
		}
		else if (i > 360){
			degreesTurned = 360;	
		}
		else {
			degreesTurned = i;
		}
	}
	public double getDegreesTurned() {
		return degreesTurned;
	}

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */
	public void setNomenclature(String s) {
		if (s.length() == 0) {
			nomenclature = " ";
		}else {
			nomenclature = s;	
		}
	}
	public String getNomenclature() {
		return nomenclature;
	}

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */
	public void setMemberObj(Object o) {
		if (o instanceof String) {
			memberObj = new Object();
		}else {
			memberObj = o;	
		}
	}
	public Object getMemberObj() {
		return memberObj;
	}


}
