package ExceptionHandling;

//It do not matter exception is coming or not, but it always go inside the finally block

//finally can be attached to try block. i.e. we can write finally block instead of catch block

//Try block is used without catch block, when it is used with finally block.

// finally block can not used without try block.

//Practicle example of finally block is closing the database.

public class FinallyBlock {
	
		public static int getMarks(String stName) {
			System.out.println("Student Name: "+stName);
			
			if(stName.equals("Vijay")) {
				try {
				int i = 9/3;
				//System.exit(1);//shut down the JVM
				return 90;
				
				}
				catch(ArithmeticException e) {
					System.out.println("AE is coming.........");
					return 20;
				}
				finally {
					System.out.println("inside finally block");
					//return 10;
				}
				
			}
			else if(stName.equals("Aman")) {
				return 95;
			}
			else if(stName.equals("Rutuja")) {
				return 100;
			}
			else {
				System.out.println("Student not found "+stName);
				return -1;
			}
		}
	
	

	public static void main(String[] args) {
		
		
		System.out.println(getMarks("Vijay"));

//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
//		
//		try{
//		int i = 9/3;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is coming.....");
//			e.printStackTrace();
//		}
//		
//		finally {
//			System.out.println("Inside the finally block");
//		}
//		
//		System.out.println("Bye");
	}

}
