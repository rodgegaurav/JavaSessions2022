package constructorconcept;

import java.util.ArrayList;

public class TestComp {

	public static void main(String[] args) {
		
		Company c1 = new Company("IBM", "NY");
		System.out.println(c1.name+" "+c1.empCount+" "+c1.hq+" "+c1.sharePrice);

		Company c2 = new Company("TCS", 1000, 10.99);
		System.out.println(c2.name+" "+c2.empCount+" "+c2.hq+" "+c2.sharePrice);
	
		c2.hq = "pune";
		
		System.out.println(c2.name+" "+c2.empCount+" "+c2.hq+" "+c2.sharePrice);
	
		//
		
		Customer cu1 = new Customer("naveen","9999","naveen@gmail.com");
		System.out.println(cu1.ordersList);
		
		ArrayList<String> tomOrderList = new ArrayList<String>();
		tomOrderList.add("mac");
		tomOrderList.add("i12");
		tomOrderList.add("book");
		
		//when we pass the empty ArraList with return keyword, then we get blank ArrayList 
		//when we access the ArrayList,we get default value of ArrayList i.e. null 
		
		Customer cu2 = new Customer("Tom", "Petre", tomOrderList);
		
		System.out.println(cu2.firstname+" "+cu2.lastname+" "+cu2.ordersList);
	
	
	}

}
