package builderpattern;

public class ShopTest {

	public static void main(String[] args) {
		
		AmzonShop app = new AmzonShop();
		
		app.login().login("Gauarv", "Pass")
				.search().search("mac", "white");
		
		//
		app.login()
			.search("a", "b");

	}

}
