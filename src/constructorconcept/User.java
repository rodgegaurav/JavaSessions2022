package constructorconcept;

public class User {
	
	String id;
	String name;
	int age;
	boolean  isActive;
	
	public User(String id, String name, int age, boolean isActive) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

	public User(String id, String name, boolean isActive) {
		
		this.id = id;
		this.name = name;
		this.isActive = isActive;
	}

	public User(String id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	//ShortCut ......- to create constructor
	// Right Click - Source - generate constructor
	
	public static void main(String[] args) {
		User u1 = new User("101", "Tom");
		User u2 = new User("101", "Tom",25);
		User u3 = new User("101", "Tom",true);
		User u4 = new User("101", "Tom",25,false);
		System.out.println(u1.age+u2.age+u3.age+u4.age);
		//User u5 = new User();

	}

}
