package BrowserVendors;

import Browser.BrowserUtil;

public class TestBrowser {

	public static void main(String[] args) {
		
		Crome c = new Crome();
		c.click();
		c.launchURL();

//		BrowserUtil br = new Crome();
//		br.click();
		
			
		BrowserUtil br1 = new Firefox ();
		br1.click();
		
		BrowserUtil br2 = new Safari ();
		br2.click();
		
		BrowserUtil br = null;
		
		String browserName = "crome";
		
		//cross browser logic
		
		if(browserName.equals("crome")) {
			br = new Crome();
		}
		else if(browserName.equals("firefox")) {
			br = new Firefox();
		}
		else if(browserName.equals("safari")) {
			br = new Safari();
		}
		else {
			System.out.println("Please pass right browser");
		}
		
		br.click();
	}

}
