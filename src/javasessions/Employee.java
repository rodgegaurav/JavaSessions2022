package javasessions;

public class Employee {
	
	//class: template, category of all Object, Blueprint for all objects.
	//data member: variables,method
	int id;
	String name;
	int age;
	double salary;
	static final String compName = "IBM";
	
	//final word can be use with local as well as class variable
	
	public static void main(String[] args) {
		
		final int days = 7;
		//days = 10;
		System.out.println(days*100);
		
		System.out.println(Employee.compName);
		//Employee.compName = "MS";
		System.out.println(Employee.compName);
		
		//create the Object of Employee class
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Sachin";
		e1.age = 30;
		e1.salary = 10000;
		
		
		System.out.println(e1.id+" "+e1.name+" "+e1.age+" "+e1.salary);
		
		Employee e2 = new Employee();
		
		System.out.println(e2.id+" "+e2.name+" "+e2.age+" "+e2.salary);
		
		Employee e3 = new Employee();
		e3.age = 20;
		e3.name = "Pooja";
		System.out.println(e3.id+" "+e3.name+" "+e3.age+" "+e3.salary);
		
		//no reference object
		new Employee().id = 1011;
		new Employee().name = "Tom";
		// two object is created.
		
		//Null reference Object:
		Employee e4 = new Employee();
		e4=null;
		//e4.id = 103;// Null Pointer exception.
		
		System.gc();

	}

}
