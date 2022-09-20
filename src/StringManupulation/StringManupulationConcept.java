package StringManupulation;

import java.util.Arrays;

public class StringManupulationConcept {

	public static void main(String[] args) {
		
		//String is nothing but character array, space is also included, beacause 
		//space is also character
		
		String str = "This is my java code and i am so happy";
		
		System.out.println(str.length());//38
		int len	= str.length();
		int hi = len -1;
		int li = 0;
		System.out.println(hi);
		
		System.out.println(str.charAt(0));//T
		System.out.println(str.charAt(37));//y
		//System.out.println(str.charAt(38));//IOB
		//System.out.println(str.charAt(-1));//IOB
		
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('i'));//1st occurance
		System.out.println(str.indexOf('i', 3));//should start counting after 1st i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));// 2nd occurance of i
		
		int num = (str.indexOf('i', str.indexOf('i')+1));
		
		System.out.println(str.indexOf('i', num+1));// 3rd occurance of i
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Gaurav"));
		
		String masg = "welcome admin";
		if(masg.indexOf("admin")!= -1){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		String st = "   this IS my first JAVA code   ";
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.trim());
		
		//replace
		
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		String t = "    hello selinium    ";
		System.out.println(t.replace(" ", ""));
		
		//contains
		
		String m = "your use id is naveenautomation";
		System.out.println(m.contains("naveenautomation"));
		
		//equals
		//String literals
		String p = "hello selenium";
		String k = "hello selenium";
		System.out.println(p.equals(k));
		System.out.println(p.equalsIgnoreCase(k));
		
		//String is class
		
		String h = new String("hello world");//2 Object created (1 in SCP and another in heap memory)
		String g = new String("hello world");// 1 Object is created (SCP do not contais duplicate value, only 1 object is created inside the heap)
		//SCP - 1 - "hello world"
		
		String n = "hello world";//0 object created (because "hellow world is already created in SCP")
				
		System.out.println(h==n);//false
		System.out.println(h==g);//false
		System.out.println(p==k);//true ---> comparing the object references
		System.out.println(h.equals(g));//true ---> comparing the value
		
		//String Constant POOL(SCP) - it is available in heap memory only for string
		// String literals are stored in SCP
		// in SCP you do not have duplicate String ---> this is the optimization, java done.
		
		String nn = "hello world";//0 object created 
		System.out.println(n==nn);//true
		
		String kk = "Hello Selenium";//2 object created (H and S is capital, 2 object is created in heap and SCP )
		
		//String is immutable:
		
		String sp = "Sachin";
		//System.out.println(sp+"tendulkar");
		System.out.println(sp);
		
		sp = sp+"tendulakar";//1 object is cretaed
		System.out.println(sp);
		
		String sp1 = "Sachin";//0 object is created
		
		//substring
		
		String test = "your order id is 12345";
		System.out.println(test.substring(17));
		System.out.println(test.substring(1, 12));
		System.out.println(test.substring(test.indexOf("is")+3, test.length()));
		
		//split:
		
		String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
		String l[] = lang.split("_");
		System.out.println(l[0]);
		System.out.println(l[3]);
		
		String empData = "Gaurav:Rodge:TCS:Pune:India:Designer";
		String emp[] = empData.split(":");
		System.out.println(emp[0]);
		System.out.println(emp[1]);		
		System.out.println(emp[2]);		
		
		System.out.println(Arrays.toString(emp));
		
		for(String e:emp) {
			System.out.println(e);
		}
		
		//
		String pop = "seliniumhelloworldhellotesting";
		String p1[] = pop.split("hello");
		System.out.println(p1[0]);
		System.out.println(p1[1]);
		
		System.out.println("--------------");
		//
		String pool = "xXtestingXxXxXseliniumxXpythonxXautomationX";
		String pl[] = pool.split("xX");
		System.out.println(pl[0]);
		System.out.println(pl[1]); 
		System.out.println(pl[2].length());
		System.out.println(pl[3]);
		System.out.println(pl[4]);
		System.out.println(pl[5]);
		
	}

}
