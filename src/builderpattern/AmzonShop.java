package builderpattern;

public class AmzonShop {
	
	public AmzonShop login() {
		System.out.println("login to app");
		return this;//returning current class object
	}
	public AmzonShop login(String un, String pwd) {
		System.out.println("login with: "+un+" "+pwd);
		return this;
	}
	public AmzonShop search() {
		System.out.println("display");
		return this;
	}
	public AmzonShop search(String prodName, String color) {
		System.out.println("color: "+prodName+color);
		return this;
	}


}
