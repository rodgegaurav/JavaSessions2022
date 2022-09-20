package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
	
		int i = 10;
		int j = 20;
		
		System.out.println(i==j);
		
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			 System.out.println("both are not equal");
		}
		
		if(j>=i) {
			System.out.println("Hi");
		}
		
		if(i<=j) {
			System.out.println("Hello");
		}
		
		if(true) {
			System.out.println("Hellow Gaurav");
		}
		/*else {//dead code
			System.out.println();
		}*/


		boolean flag = true;
		if(flag) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");
		}
		
		//
		int marks = 80;
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("A grade");
			}
			if(marks<=80) {
				System.out.println("B grade");
				if(marks<=50) {
					System.out.println("C garde");
				}
				else {
					System.out.println("Gaurav Good Bye");
				}
			}
			else {
				System.out.println("Good Bye");
			}
		}
		else {
			System.out.println("Wrong Marks");
		}
		
		// if condition
		
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("Launch crome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("Launch firefox");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("Launch safari");
//		}
//		else {
//			System.out.println("please pass the right browser");
//		}
		
		// else if conditon
		
		String browser = "ie";
		if(browser.equals("crome")) {
			System.out.println("Launch Crome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("Launch firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch safari");
		}
		else {
			System.out.println("please pass the right browser");
		}
		
		
	}

}
