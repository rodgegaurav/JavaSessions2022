package AccessModifier;

public class Car {
	
	//class data members: variables + methods
	// static is property of class
	//I can not inherate class variable if it is declare as final
	//i can not inherate & override those method also if it declare as final
	//i can not inherate those class also if it is declare as final
	
	public String name;
	private int price;
	protected String color;
	String lincense;//default

	public static void main(String[] args) {
		
		//public int i = 10;
		
		//access modifier are not allowed for local variables.
		//static is also not allowed for local variable.
		// final can be used with local variable
		
		final int i = 10;//constant variable.
		//i= 20;
		
		
	}

}
