package OOP_Inheritance;

public class BMW extends Car {
	
	//Method Overriding:morphisum : Runtime(Dynamic) polymorphism
	
	//When you have a method in parent class and same method is in the child class with:
	//1. method name should be same.
	//2. same number of parameter.
	//3. same type of parameter.
	//4. same sequence.
	//5. same return type.
	//6. static/private/final method can not be overridden
	//7. static method can be overloaded
	//8. class is declared with final keyword, the we can not inherent that class properties
	
	//use of super();
	//1. super(); keyword must be the first statement of child class constructor.
	//2. you can called parent class constructor by child class constructor using supper(); keyword
	//3. super(); also used in method to access parent class properties
	//4. always used in child class
	
	int speed = 200;
	
	public BMW() {
		super();
		System.out.println("testing");
		
	}
	@Override
	public void start() {
		System.out.println("BMW--Start");
	}
	
	
	public void autoParking() {
		System.out.println("BMW-- paeking");
	}
	@Override
	public void engine() {
		System.out.println("BMW--engine");
	}
	
	public void autoStart() {
		System.out.println("BMW--autoStart");
	}
	
	//method hiding - same static method is available in both parent and child class
	//@Override
	public static void run() {
		System.out.println("BMW---run");
	}
	
	
	private void billing() {
		System.out.println("Car--biling");
		
	}
	
	@Override
	public void aeroDynamic() {
		System.out.println("BMW -- aerodynamic");
	}
	

}
