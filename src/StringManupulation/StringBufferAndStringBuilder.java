package StringManupulation;

public class StringBufferAndStringBuilder {
	
	//String = immutable-->slowest
	
	// StringBuffer and StringBuuilder = mutable
	
	//StringBuffer ----> class already available in java --> Thread-Safe--> slow
	//sequential exucation
	
	public static void main(String [] args) {
	
		StringBuffer sf = new StringBuffer("hello");
		System.out.println(sf);
		sf.append("hi");
		System.out.println(sf);
		
		//StringBuilder ---> class already available in java --> Not Thread-Safe--> Fast
		// Not sequential exucation
		//parallel excution 
		
		//Disadvatntage:
		//you might get old value instead of new updated value beacuse of non safe env
		// information loss			
		
		StringBuilder sb = new StringBuilder("testing");
		System.out.println(sb);
		sb.append("hi");
		System.out.println(sb);
	
	
	
	
	}

}
