package OOP_Encapsulation;

public class TestUser {

	public static void main(String[] args) {
		
		//create a user, get the user info, but update is not allowed -- const. getter
		//create a user, get the user info, but update is allowed -- const. getter, setter
		User u1 = new User("Gaurav", 20, true);
		
		//retrive: GET
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.isActive());
		
		System.out.println("-----");
		
		//update: PUT/PATCH
		u1.setActive(false);

		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.isActive());
		
		System.out.println("-----");
		
		u1.setName("Guarav Rodge");
		u1.setActive(true);
		
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.isActive());
	}

}
