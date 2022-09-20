package javasessions;

public class MailApp {
	
	int price;//copy of this variable is stored in side the class
	static String name = "gmail";//this variable is stored in CAM
		
	public void sendMail() {//copy of this variable is stored in side the class
		System.out.println("send mail");
	}
	
	public static void sendInfo() {//this variable is stored in CAM
		System.out.println("send info");
	}

	public static void main(String[] args) {//main method is also stored in CMA
		
		// Main method is static in nature because it is called by JVM.
		//JVM will not create any object reference by itself
		//object reference should be created by user
		
		MailApp ma = new MailApp();
		ma.sendMail();
		
		//how to call static method - 1.use class name
		
		MailApp.sendInfo();
		System.out.println(MailApp.name);
		
		//2.Call directly
		sendInfo();
		
		//3.call using object refernce
		//ma.sendInfo();
		

	}

}
