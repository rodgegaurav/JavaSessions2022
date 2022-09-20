package SuperKeyword;

public class Audi extends Car {
	
	int speed = 200;

	
	// we can call only one constructor at a time.
	//we can call parent class variable, static as well as non static method by super keyword
	
	public Audi() {
		super(10);
		System.out.println("Audi......const......");
	}

	@Override
	public void start() {
		System.out.println("Audi ---- Start");
		super.start();
		System.out.println(super.speed);//100
		super.refuel();
	}
	
	
	public void getspeed() {
		System.out.println(speed);//200
		System.out.println(super.speed);//100
	}
	
//	public Audi(int a) {
//		super(a);
//		// TODO Auto-generated constructor stub
//	}


}
