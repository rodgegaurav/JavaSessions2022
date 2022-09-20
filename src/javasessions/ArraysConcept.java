package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// Two Limitation
		//1. size is fixed: use arraylist
		//2. similar type of data: Object array
		
		//1st method
		String st2[] = "Shivam, Pramod".split(",");
		System.out.println(Arrays.toString(st2));
		
		//2nd method
		String st1[] = new String[] {"Guarv","Rutuja"};
		System.out.println(Arrays.toString(st1));
		System.out.println(st1[0]);
		System.out.println(st1.length);
				
		
		// Array Literals:
		
		int m1[] = {1,2,3,4,70};
		System.out.println(m1.length);
		System.out.println(m1[1]);
		System.out.println(m1[m1.length-1]);
		System.out.println("----------");
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 300;
		i[3] = 200;
		System.out.println(i.length);
		System.out.println("HI : "+(i.length - 1));
		System.out.println("LI : "+0);
		System.out.println(i[0]);
		System.out.println(i[1]+i[3]);
		//System.out.println(i[4]);
		//System.out.println(i[-1]);
		
		int k[] = new int[3];
		k[0] = 10;
		k[2] = 20;
		//k[3] = 30;
		
		System.out.println(k[0]);
		System.out.println(k[1]);
		System.out.println(k[2]);
		//System.out.println(k[3]);
		
		int mark[] = new int[4];
		mark[0] = 100;
		mark[1] = 200;
		mark[2] = 300;
		mark[3] = 400;
		
		System.out.println("*****");
		// for each loop:
		
		for(int k1:mark) {
			System.out.println(k1);
		}
		System.out.println("------");
		
		for(int p=0; p<mark.length; p++) {
			System.out.println(mark[p]);
		}
		
		System.out.println(Arrays.toString(mark));
		System.out.println(mark[2]);
		System.out.println(Arrays.toString(k));
		
		byte b[] = new byte[3];
		short s[] = new short[5];
		double d[] = new double[6];
		
		System.out.println("------");
		
		//String array;
		
		String emp[] = new String[5];
		emp[0] = "Gaurav";
		emp[1] = "Rutuja";
		emp[2] = "Kalpana";
		emp[3] = "Ankush";
		emp[4] = "Ravi";
		
		for(int t=0; t<emp.length; t++) {
			if(emp[t].equals("Rutuja")) {
				System.out.println("Hi...........");
				break;
			}
			System.out.println(emp[t]);
		}
		
		System.out.println(Arrays.toString(emp));
		
		//object array;
		Object data[] = new Object[5];
		data[0] = "TOM";
		data[1] = 1126107;
		data[2] = 'A';
		data[3] = 12.55;
		data[4] = true;
		
		System.out.println("*****");
		for(Object e:data) {
			System.out.println(e);
		}
		System.out.println("*****");
		
		System.out.println(Arrays.toString(data));
		for(int n=0; n<data.length; n++) {
			System.out.println(data[n]);
		}
		
		

	}

}
