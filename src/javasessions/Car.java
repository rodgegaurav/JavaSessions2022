package javasessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels = 4;//common for all
	
	//static variable only allow for class variable
	
	
	//CMA - common memory Allocation/permanant generation/meta space(Dynamic memory allocation)
	//static variable are stores in CMA or Meta Space.
	//Static Variables are called by class name
	
	public static void main(String[] args) {
		
		//static int k = 10;
		//static variable is not use as local variable
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "Red";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 40;
		c2.color = "Black";
				
		Car c3 = new Car();
		c3.name = "Maruti";
		c3.price = 50;
		c3.color = "White";
		
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+Car.wheels);
		System.out.println(Car.wheels);//by class name
		System.out.println(wheels);//by direct variable
		//System.out.println(c1.wheels);//by object name, but give warining
		

	}

}
