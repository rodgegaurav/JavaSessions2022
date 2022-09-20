package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	
	public ArrayList<String> getPageMenuLinks(String pageName) {
		
		System.out.println("page name is"+pageName);
		
		ArrayList<String> menuList = new ArrayList<String>();
		
		if(pageName.trim().equalsIgnoreCase("loginpage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
		}
		else if(pageName.trim().equalsIgnoreCase("homepage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
			menuList.add("search");
			menuList.add("cart");
		}else if(pageName.trim().equals("productpage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
			menuList.add("info");
			menuList.add("seller");
		}
		else {
			System.out.println("please pass the right page name"+pageName);
		
		}
		return menuList;
		
		}
	
	public String[] getEmpDeviceList(String empName) {
		
		System.out.println("welcome to IT team"+empName);
		
		String device[] = new String[5];
				
		empName = empName.toLowerCase();
		if(empName.equals("sachin")) {
			device[0] = "iphone";
			device[1] = "mac";
			device[2] = "airtel sim";		
		}
		else if(empName.equals("gaurav")) {
			device[0] = "lenevo";
			device[1] = "mac";
			device[2] = "airtel sim";		
		}
		else if(empName.equals("rutuja")) {
			device[0] = "java";
			device[1] = "mac";
			device[2] = "airtel sim";		
		}
		else {
			System.out.println("emplyee not found");
		}
		return device;
		
	}
	

	public static void main(String[] args) {
		
		Application app = new Application();
		ArrayList<String> loginList = app.getPageMenuLinks("  Loginpage  ");
		System.out.println(loginList);
		
		String emp_device[]  = app.getEmpDeviceList("naveen");
		System.out.println(Arrays.toString(emp_device));
		System.out.println(Arrays.toString(app.getEmpDeviceList("sachin")));

	}

}
