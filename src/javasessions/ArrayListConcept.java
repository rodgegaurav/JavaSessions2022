package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
//		ArrayList is default class in java
//		order/index based arraylist
		
		ArrayList<Integer> ar = new ArrayList<Integer>();//vc = 10, pc = 0
		
		// VC = PC/2
		
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());
		ar.add(500);//4
		ar.add(600);//5
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		
		System.out.println("----------");
		
		ArrayList ar1 = new ArrayList(5);
		//vc = 5
		
		ar1.add(100);
		ar1.add("testing");
		ar1.add(300);
		ar1.add(400);
		ar1.add(500);
		System.out.println(ar1.size());
		System.out.println(ar1);
		ar1.add(600);
		System.out.println(ar1);
		
		for(int i=0; i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("----------");
		
		//Generics
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(30);
		
		System.out.println("----------");
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Nidhi");
		nameList.add("Sachin");
		nameList.add("Saurabh");
		nameList.add("Pooja");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		//for each loop;
		
		for(String e:nameList) {
			System.out.println(e);
		}
		System.out.println("*************");
		for (int i=0; i<nameList.size(); i++) {
			if(nameList.get(i).equals("Saurabh")) {
				System.out.println("100% Bonus");
				System.out.println(nameList.get(i));
				break;
			}
			System.out.println(nameList.get(i));
		}
		
		System.out.println("----------");
				
		ArrayList<Object> emp = new ArrayList<Object>();
		emp.add("Tom");
		emp.add(20);
		emp.add(12.33);
		emp.add(true);
		emp.add('m');
		
		System.out.println(emp.size());
		for(int k=0; k<emp.size(); k++) {
			System.out.println(emp.get(k));
		}
		
		System.out.println("----------");
		//
		for(Object e:emp) {
			System.out.println(e);
		}
		
		
		
	}

}
