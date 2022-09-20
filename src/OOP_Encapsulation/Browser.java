package OOP_Encapsulation;

public class Browser {
	
	public void lunchCromeBrowser() {
		checkOS();
		checkRAM();
		System.out.println("lunchCromeBrowser");
	}
	
	private void checkOS() {
		System.out.println("checkOS");
	}
	
	private void checkRAM() {
		System.out.println("checkRAM");
	}

}
