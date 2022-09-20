package javasessions;

public class Customer {
	
	//Method/Function:
	//can not create a method inside a method
	
	//1.No input and no return:
	//Void = can not anything.
	//Void and return can not be together
	//method can not return multiple valve
	//return should be the last statement of function
	
	public void test() {// zero input parameter function
		System.out.println("test method..");
	}
	
	public void printName() {
		System.out.println("my name is naven");
		String name = "Naveen Automation Lab";
		System.out.println(name);
	}
	
	//2. No input but some return
	//return type : int
	public int getNumber() {
		System.out.println("get number");
		int num = 100;
		int num1 = 200;
		int sum = num+num1;
		System.out.println(sum);
		return sum;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Gaurav";
		return name;
	}
	
	public int getBillAmount() {
		int a = 100;
		int b = 200;
		int c = 300;
		int d = a+b+c;
		return d;
	}
	
	//waf: name: getMark
	//input parameter: studentName(String)
	//return: marks(int)
	public int getMarks(String studentName) {
		System.out.println("Student Name is "+ studentName);
		if(studentName.equals("Vijay")) {
			return 90;
		}
		else if(studentName.equals("Aman")) {
			return 95;
		}
		else if(studentName.equals("Gaurav")) {
			return 85;
		}
		else if(studentName.equals("Rutuja")) {
			return 80;
		}
		else {
			System.out.println("student name is not found"+studentName);
			return -1;
		}
		
	}
	
	public int getStudentMarks(String studentName) {
		System.out.println("Student Name is "+ studentName);
		int marks=-1;
		
		if(studentName.equals("Vijay")) {
			//return 90;
			marks=100;
		}
		else if(studentName.equals("Aman")) {
			//return 95;
			marks=95;
		}
		else if(studentName.equals("Gaurav")) {
			//return 85;
			marks=85;
		}
		else if(studentName.equals("Rutuja")) {
			//return 80;
			marks=80;
		}
		else {
			System.out.println("student name is not found"+studentName);
			//return -1;
			
		}
		return marks;
		
	}
	
	
	//3. some input and some return
	//two input parameter
	public int add(int a, int b) {// a and b is parameter
		System.out.println("add methos...");
		int total = a+b;
		return total;
	}

	public static void main(String[] args) {
		
		// create object of class
		Customer obj = new Customer();
		obj.test();
		obj.printName();
		int s1 = obj.getNumber();
		System.out.println(s1);
		
		System.out.println(obj.getNumber());
		String n1 = obj.getTrainerName();
		System.out.println(n1);
		
		int n2 = obj.getBillAmount();
		System.out.println(n2+50-10);
		
		int m1=obj.add(10, 20);//10 and 20 are argument
		System.out.println(m1);
		
		int m2=obj.add(100, 200);
		System.out.println(m2-100);
		
		int nk = obj.getMarks("Vijay");
		System.out.println(nk);
		if(nk==-1) {
			System.out.println("do not print marksheet");
		}
		
		int mr = obj.getStudentMarks("Tom");
		System.out.println(mr);
		

	}

}
