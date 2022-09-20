package javasessions;

public class Ecom {
	
	//method overloading: Polyorphisam : compile time : Static
	//1. within same class
	//2. different number of parameter
	//3. different type of parameter
	//4. different sequence
	//5. return do not matters.
	
	public void test() {
		System.out.println("test method");
	}
	
	public int test(int a) {
		System.out.println("test method: "+a);
		return a+10;
	}
	
	public double test(double a) {
		System.out.println("test method: "+a);
		return a+20.33;
	}
	
	public void test(int a, int b) {
		System.out.println("test method "+(a+b));
	}
	
	public void test(String a, int b) {
		System.out.println("test method "+(a+b));
	}
	
	public void test(int a, String b) {
		System.out.println("test method "+(a+" "+b));
	}
	
	//Login
	
	public void login(String un, String pd) {
		System.out.println("login successfu");
		
	}
	
	public void login(String un, String pd, String role) {
		
	}
	
	public void login(String un, int oyp) {
		
	}
	

	public static void main(String a[]) {
		
		//System.out.println(a.length);//0
		//System.out.println(a[0]);//AIOB
		
		Ecom obj = new Ecom();
		obj.test();
		double d=obj.test(10.33);
		System.out.println(d);
		obj.test(2, "sachin");
		obj.login("Gaurav", "Pass#123");

	}

}
