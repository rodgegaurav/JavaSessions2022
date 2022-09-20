package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Nidhi");//0
		empList.add("Sachin");//1
		empList.add("Saurabh");//2
		empList.add("Pooja");//3
		empList.add("Tom");//4
		empList.add("Peter");//5
		empList.add("Nidhi");//6
		//empList.add(null);
		//empList.add(null);
		empList.add(1,"Naveen");
		
		
		System.out.println(empList);
		System.out.println(empList.size());
		System.out.println(empList.get(7));
		System.out.println(empList.remove(0));
		System.out.println(empList);
		System.out.println(empList.size());
		
		System.out.println("---------");
		
		ArrayList<String> stList = new ArrayList<String>();
		stList.add("Nidhi");//0
		stList.add("Sachin");//1
		stList.add("Saurabh");//2
		stList.add("Pooja");//3
		stList.add("Tom");//4
		stList.add("Peter");//5
		stList.add("Nidhi");//6
		
		for(int i=0; i<stList.size(); i++) {
			System.out.println(stList.get(i));
		}
		
		System.out.println("---------");
		
		for(String e:stList) {
			System.out.println(e);
			if(e.equals("Pooja")) {
				System.out.println("Hi");
				break;
					
			}
		}
		
		System.out.println(stList.contains("Tom"));
		if(stList.contains("pooja")) {
			System.out.println("Test cas is Pass");
		}
		else {
			System.out.println("test case is faile");
		}
		//Reverse Order Print
		
		System.out.println("---------");
		
		for(int i=stList.size()-1; i>=0; i--) {
			System.out.println(stList.get(i));
		}
		
		//collection class
		
		Collections.swap(stList, 0, 1);
		System.out.println(stList);
		
		
	
		Collections.reverse(stList);
		System.out.println(stList);
		
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Ravi");
		userList.add("Suman");
		userList.add("Rahul");
		System.out.println(userList);
		userList.addAll(stList);
		System.out.println(userList);
		
		//Nasted Loop
		
		for(int m=0; m<=5; m++) {
			for(int n=0; n<=5; n++) {
				System.out.print(m+""+n+" ");
			}
			System.out.println();
		}
			
	}

}

