package OOP_AbstractClass;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();//child class object
		lp.title();//overidden method
		lp.url();//overidden method
		lp.header();//overidden method
		lp.loadingPage();//inhereted method
		lp.logo();//inhereted method
		Page.footer();//static inhereted method
		LoginPage.footer();//static inhereted method
		lp.load();
		System.out.println(Page.price);
		System.out.println(LoginPage.price);		

		
		lp.doLogin("admin", "pass@123");//individual method
		
		//Top Casting: child class object can be refer by parent class reference variable
		
		Page p = new LoginPage();
		p.title();//overidden method
		p.url();//overidden method
		p.header();//overidden method
		p.loadingPage();//inhereted method
		p.logo();//inhereted method
		
		//can i not create the object of abstract class
		//Page p1 = new Page();
		//can not create the down casting in compile time also
		
		Employee e = new Employee();
		//System s = new System();
		
		
		
		
		
		
		

	}

}
