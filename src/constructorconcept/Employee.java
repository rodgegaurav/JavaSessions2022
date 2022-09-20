package constructorconcept;

public class Employee {
	
	//Class Variable - globle variable - can be used any where
	String name;
	int age;
	double salary;
	boolean isperm;
	
	//constructor of the class
	//1.constructor ..... name will be same as the class name, method may have different name
	//2.constructor ..... looks like a function but not a function
	//3.constructor ..... can not return any value, there is no return type. Method may or may not return value
	//4.constructor ..... No void
	//5.constructor ..... will be called when you create the object of class but
//	//6.method .......... will be called when, you have to create the object and 
//						then with the help of object reference you have to called
//						method, in case of non static
	//7.constructor can be overloaded
	//8.constructor .... is used to initiate the class variables with this keyword
	//9.constructor .... should not have business logic/application logic
	//10.business logic should be written inside the function.
	
	//uses of constructor
	//1. to initialize class variable
	//2. is used to create the object on the basis of given parameters.
	//3. it help to prevent creating unnecessary object
	
//	public Employee() {//0 parameter constructor - default constructor
//		System.out.println("default constructor");
//	}
//	
//	public Employee(int i) {//1 parameter constructor
//		System.out.println("1 para constructor..."+i);
//	}
//	
//	public Employee(int i, String p) {//2 parameter constructor
//		System.out.println("2 para constructor..."+i+p);
//	}
	
	public Employee(String name, int age) {//here name and age is local variable
		this.name = name;// this. keyword is also used to intiate class variable
		this.age = age;//with in constructor
		
		
	}

	public static void main(String[] args) {
		
//		Employee e1 = new Employee();
//		Employee e2 = new Employee(10);
//		Employee e3 = new Employee(100,"Gaurav");
		
		Employee e4 = new Employee("Gaurav",27);
		System.out.println(e4.name+" "+e4.age);
		
		
		
		

	}

}
