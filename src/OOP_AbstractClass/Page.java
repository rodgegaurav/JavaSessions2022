package OOP_AbstractClass;

public abstract class Page {
	
	public String name;
	public int timeout;
	static int price = 10;
	
	
	//0 to 100% abstraction
	//only non abs...method --->  0% abstraction
	//only abs...method --->  100% abstraction
	//only non abs & abs......method --->  partial abstraction
	//interface are 100% abstraction
	//can not create the object of abstract class
	//but constructors are allowed... and it will be called when you create the object of child class
	//In case of constructor calling --> 1st preference is to Parent class constructor and then child class constrcutor
	
	public Page(){
		System.out.println("Page ....Constructor..");
	}
	
	public Page(String name, int timeout){
		this.name = name;
		this.timeout = timeout;
		System.out.println("Page ....Constructor.."+name+"  "+timeout);
	}
		
	public abstract void title();
	
	public abstract void url();
	
	public abstract void header();
	
	public void loadingPage() {
		System.out.println("page---loading" + 20);
	}
	
	public final void logo() {
		System.out.println("Page -- logo");
	}
	
	public static void footer() {
		System.out.println("page --- footer");
	}
	
	private void loadHTML() {
		System.out.println("page --- load HTML");
	}
	
	public void load() {
		loadHTML();
	}
	
	
	

}
