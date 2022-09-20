package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		//child class has only one parent class
		
		BMW b = new BMW();
		b.start();//Overriden method -- available in both parent and child class
		b.stop();//inherited from Car class - available in parent class only
		b.refuel();//inherited from Car class
		b.autoParking();//individual - available in child class only
		b.engine();
		System.out.println(b.speed);
		b.aeroDynamic();
		
		
		BMW.run();
		
		System.out.println("----------");
		
		Car c =new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.run();
		c.aeroDynamic();
		
		System.out.println("----------");
		
		Audi a = new Audi();
		a.thefSafety();
		a.start();
		a.start();
		a.refuel();
		a.engine();
		
		System.out.println("----------");
		
		Automobile au = new Automobile();
		au.aeroDynamic();
		
		System.out.println("----------");
		
		Truck t = new Truck();
		t.heavyLoad();
		
		System.out.println("----------");
		
		//Top Casting
		Car c1 = new BMW();//child class object can be referred by parent class reference variable
		c1.start();
		c1.stop();
		c1.refuel();
		//for autoParking method ---- reference type check is failed for C1.
		//so that c1 is not able to access autoParking method. as it is
		//individual method of BMW class OR parent class reference can not access child class method
		c1.engine();
		
		Vehicle c2 = new BMW();//child class object can be referred by grandparent class reference variable
		Automobile c3 = new Automobile();
		c2.aeroDynamic();
		c2.engine();
		
		
		//Down Casting -- ClassCastException exception will come in run time.
		
		//BMW b1 = (BMW)new Car();// ClassCastException exception in run time
		//Every car is not a BMW
	}

}
