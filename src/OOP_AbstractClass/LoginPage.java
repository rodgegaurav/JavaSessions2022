package OOP_AbstractClass;

public class LoginPage extends Page {
	
	static int price = 20;
	
	public LoginPage() {
		super("gaurav", 27);
		System.out.println("Login page.... class constructor....");
	}

		
	@Override
	public void title() {
		System.out.println("Login with: title");
		
	}

	@Override
	public void url() {
		System.out.println("Login with: url");
		
	}

	@Override
	public void header() {
		System.out.println("Login with: header");		
	}
		

	
	public void doLogin(String un, String pwd) {
		System.out.println("Login with: "+un+" "+pwd);
	}

	@Override
	public void loadingPage() {
		System.out.println("page---loading" + 10);
	}
	
	
	
	
	

}
