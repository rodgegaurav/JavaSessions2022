package javasessions;

public class MainMethodOverloading {
	
	//we can overload main method
	
	public void main() {
		System.out.println("main mathod");
	}
	
	public void main(String a) {
		System.out.println("main mathod"+a);
	}

	//jvm is calling main mathod with no values - command line arguments
	public static void main(String t[]) {
		System.out.println("this is my java code");
		
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main("Sachin");

	}
	public static void main(int a[]) {
		System.out.println("java code");

	}

}
