package ExceptionHandling;

//"Exception" & "Error" class is child of "Throwable" class
//"Exception" class is parent class of all Exception class
//Error is coming due to system or infrastucture condtions(RAM Issue).
//Exception is coming due to wring coding condition
//with "Throwable" we can handle both exception as well as error.
//"Object" class is the superclass of classes in java
//therefore "throwable" is child of "Object" class
//we can write multiple catch block with single try block
//"Object" class can not be used for exception handling

public class Employee {
	
	String name = "Naveen";
				
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			Employee e = new Employee();
			e=null;
			System.out.println(e.name);
			int i = 9/0;
			System.out.println("hellow");
			System.out.println("hellow");
			System.out.println("hellow");
		}
		catch(Throwable e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
//		catch(NullPointerException e) {
//			System.out.println("NPE is coming");
//			e.printStackTrace();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//		}
//		
		System.out.println("bye");

	}

}
