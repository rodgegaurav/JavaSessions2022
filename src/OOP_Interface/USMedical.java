package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	//interface variables are static and final in nature by default
	
	//can not have any method body
	//no method body --- Abstract method
	//only method prototype --- only method declaration
	//interface can not have method business logic
	//can not create object of interface
	//can not have constructor in interface, as we can not able to create object of interface
	
	// class to class -- use extends
	// interface to interface -- use extends
	// class to interface -- use implements
	
	//interface can not have any parent class
	
	public void cardioServices();//Abstract method
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	@Override
	public void covid19();
	
	
	//public static void test(); ---- we can not override static method.
									//so that Abstract Method can not be static
	
	
	//after JDk1.8 : two major changes:
	//1. can have static method with method body:

		public static void billing() {
			System.out.println("US--biling");
		}
		
	//2. can have default method with method body:
		default void medicaRD(){
			System.out.println("medicaRD");
			
		}
}

	
	