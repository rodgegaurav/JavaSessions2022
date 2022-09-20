package constructorconcept;

import java.util.ArrayList;

public class Booking {
	
	String name;
	String id;
	ArrayList<Integer> bookingList;
	
	public Booking(String name, String id, ArrayList<Integer> bookingList) {
		this.name = name;
		this.id = id;
		this.bookingList = bookingList;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
				
		Booking b1 = new Booking("Navven", "101", ar);
		System.out.println(b1.name+" "+b1.id+" "+b1.bookingList);
		System.out.println(b1.bookingList.size());

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		Booking b2 = new Booking("Gaurav", "1001", ar1);
		System.out.println(b2.name+" "+b2.id+" "+b2.bookingList);
		System.out.println(b2.bookingList.size());
	}

}
