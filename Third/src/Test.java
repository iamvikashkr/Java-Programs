
public class Test {
	 Test() 
	 {
		 System.out.println("One"); 
		 }
	 Test(Test a) 
	 { System.out.println("Two");
	 } 
	 public static void main(String[] args) 
	 {
		 System.out.println(new Test(new Test())); 
		 }
	 }

