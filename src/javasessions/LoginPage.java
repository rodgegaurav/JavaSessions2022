package javasessions;

import java.util.Arrays;

public class LoginPage {
	
	String username;
	String password;
	boolean isActive;
	double bmi;
	int age;
	char gender;
	
	String st[] = {"tom", "lisa", "peter"};
	//st(0) = 10;
	
	

	public static void main(String[] args) {
		LoginPage lp= new LoginPage();
		System.out.println(lp.gender);
		System.out.println(Arrays.toString(lp.st));
		System.out.println(lp.st.length);
		System.out.println(lp.st[1]);

	}

}
