package BrowserVendors;

import Browser.BrowserUtil;

public class Crome extends BrowserUtil {
	
	@Override
	public void click() {
		System.out.println("crome --  clicking.....");
	}

	public void launchURL() {
		System.out.println("https//google.com");
	}
	
	

}
