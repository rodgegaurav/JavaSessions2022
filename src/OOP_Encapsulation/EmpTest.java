package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		//advantage of encapsulation
		//data security
		//prevent unnessary access to end user

		Employee e1 = new Employee();
		
		e1.setName("Tom");
		e1.getName();
		System.out.println(e1.getName());
		String n = e1.getName();
		System.out.println(n);
		
		e1.setage(25);
		System.out.println(e1.getage());
		
		LoginPage lp = new LoginPage();
		//lp.setUsername("Naveen");
		//lp.getUsername();
		//System.out.println(lp.getUsername());
		lp.setUsername(null);
		System.out.println(lp.getUsername());
		
		Browser br = new Browser();
		br.lunchCromeBrowser();

	}

}
