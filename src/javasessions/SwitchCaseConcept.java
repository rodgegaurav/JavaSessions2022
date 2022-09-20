package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = "CHROME  ";
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launch crome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
			
		default:
			System.out.println("please pass right browser");
			break;
		}
		
		//
		
		int mark = 100;
		
		switch (mark) {
		case 100:
			System.out.println("Grade A");
			if(mark == 100) {
				System.out.println("Sclolorship");
			}
			break;
		case 90:
			System.out.println("Grade B");
			break;
		case 80:
			System.out.println("Grade C");
			break;
		case 10:
			System.out.println("Grade D");
			break;

		default:
			System.out.println("Fails");
			break;
		}
		
		
		/*
		 1.Switch case - used for (byte,short,int), string and Character values 
		 2.Switch case - cannot be used for Boolean values.
		 3.Switch case - does not work with Float / Double 
		 4.Switch case - does not work with integer type-Long
		 5. Whenever there is no break statement involved in a switch case block.
		 All the statements are executed even if the test expression is not 
		 satisfied
		 6.'break' can be used only with loops or switch cases.
         7.But we can use 'break' with 'if' statement in case 
         if it's used inside 'for' loop.*/
		
		
		
		
		
		
//		System.out.println(Byte.SIZE);//8
//		System.out.println(Byte.MAX_VALUE);//127
//		System.out.println(Byte.MIN_VALUE);//-128
//		
//		String s ="  Gaurav  ";
//		String g = "Gaurav";
//		
//		System.out.println(s.length());
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(5));
//		System.out.println(s.startsWith("G"));
//		System.out.println(s.startsWith("G", 0));
//		System.out.println(s.equalsIgnoreCase("gaurav"));
//		System.out.println(s.endsWith("v"));
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(2, 4));
//		System.out.println(s.indexOf('a'));
//		System.out.println(s.indexOf('a', 3));
//		System.out.println(s.indexOf("au", 0));
//		System.out.println(s.lastIndexOf('a'));
//		System.out.println(s.concat(g));
//		System.out.println(s.replace('r', 'x'));
//		System.out.println(s);
//		System.out.println(s.replaceAll("rav", "gau"));
//		System.out.println(s.contains("rax"));
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.isEmpty());
//		System.out.println(s.trim());
//		System.out.println(s.trim().equals(g));
		
		//100,200,300 find greater number
		
		int x = 700;
		int y = 600;
		int z = 800;
		
		if(x>y && x>z) {//flase && true = false; i.e. shortcircuit operator.
			System.out.println("X is greater");
		}
		else if(y>z) {
			System.out.println("y is grater");
		}
		else {
			System.out.println("z is grater");
		}
		

	}

}
