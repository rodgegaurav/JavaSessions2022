package javasessions;

public class Browser {
	
	//AWF: launch a browser on basis of browser name
	//i/p: browserName(String)
	//return : boolean(true or false)
	
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser Name is:"+ browserName);
		boolean flag = false;
			
		switch (browserName) {
		case "crome":
			System.out.println("launch crome....");
			flag = true;
			break;
		case "firefox":
			System.out.println("launch firefox....");
			flag = true;
			break;
		case "safari":
			System.out.println("launch safari....");
			flag = true;
			break;

		default:
			System.out.println("please pass right browser...."+browserName);
		
			break;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		boolean flag = br.launchBrowser("opera");
		System.out.println(flag);
		if(flag) {
			System.out.println("www.google.co.in");
		}
	}

}
