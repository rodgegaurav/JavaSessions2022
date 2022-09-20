package javasessions;

public class LoopConcept {

	public static void main(String[] args) {
		
		//1 to 10
		
		//1.While Loop - when number of iteration is not fixed
		//calendar, pagination, page load time out,lazy loading of page
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			//i++;
			//++i;
			i=i+2;//odd numbers
		}
		
		boolean flag = true;
		while(!flag) {
			System.out.println("welcome to taj hotel");
		}
		 
		System.out.println("-----------");
		
		//2. for loop - for fix interation
		//month dropdown,menu item,arrays and arraylist
		//1 to 10
		
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		System.out.println("-----------");
//		for(;;) {
//			System.out.println("Bye");
		//}
		
		for(byte b=11; b<=20; b++) {
			System.out.println(b);
		}
		System.out.println("-----------");
		for(char c='a';c<='z';c++) {
			System.out.println(c+" : "+(int)c);
		}
		System.out.println("-----------");
		//3.dowhile loop - statement will exucute at leat once
		
		int p = 1;
		do {
			System.out.println(p);
			p++;
		}
		while(p<=10);
		// web element chech at leat one time
	}

}
