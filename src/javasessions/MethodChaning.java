package javasessions;

public class MethodChaning {
	
	//Stack over flow is error

	public void m1() {
		System.out.println("method m1");
		m2();
		MethodChaning.t1();
	}
	public void m2() {
		System.out.println("method m2");
		m3();
		t2();
	}
	public void m3() {
		System.out.println("method m3");
		m4();
	}
	public void m4() {
		System.out.println("method m4");
		//m1();
	}
	
	public static void t1() {
		System.out.println("t1 metjod");
		t2();
		MethodChaning o1 = new MethodChaning();
		o1.m4();
	}
	public static void t2() {
		System.out.println("t2 metjod");
		t3();
		
	}
	public static void t3() {
		System.out.println("t3 metjod");
	}
		
	public static void main(String[] args) {
		MethodChaning obj = new MethodChaning();
		obj.m1();
		
		MethodChaning.t1();
		t3();
		

	}

}
