package ExceptionHandling;

//"Throw" keyword is used to make customize exception.

public class ThrowKeyword {
	
	public static void getInfo() {
		
		String data = null;
		
		try {
			if(data == null) {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			}
			else {
				System.out.println(data);
				
			}
			}
			catch(Exception e) {
				System.out.println("user data not found");
				e.printStackTrace();
			}
			
			System.out.println("Bye");
		}
	

	public static void main(String[] args) {
		
		getInfo();
		
	}

}
