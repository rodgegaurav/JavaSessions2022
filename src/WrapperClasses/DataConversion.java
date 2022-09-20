package WrapperClasses;

public class DataConversion {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//String to Int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String y = "100A";
//		int j = Integer.parseInt(y);// java.lang.NumberFormatException
//		System.out.println(j);

		//String to double:
		String s = "100.22";
		System.out.println(s+20);
		double d = Double.parseDouble(s);
		System.out.println(d+20);
		
		//int to String:
		int total = 1000;
		String t = String.valueOf(total);//"1000"
		System.out.println(t+20);
		
		double tt = 50.55;
		String t1 = String.valueOf(tt);
		System.out.println(t1+20);
		
		//String to boolean:
		String p = "true";
		boolean flag = Boolean.parseBoolean(p);
		System.out.println(flag);
			
		if(flag) {
			System.out.println("pass");
		}
		
		//boolean to String:
		boolean f = true;
		String f1 = String.valueOf(f);//"true"
		System.out.println(f1+20);
		
		//String to long:
		String pop = "123356789";
		long dist = Long.parseLong(pop);
		System.out.println(dist+100);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		
		
		
		
		
	}
	
	
	
	
	

}
