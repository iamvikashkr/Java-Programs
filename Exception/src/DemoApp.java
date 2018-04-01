
public class DemoApp {

	public static void main(String[] args) {

		
			System.out.println("conn 1 established");
			Demo d=new Demo();
			try {
				d.div();
			} catch (Exception e) {
				
				System.out.println("issue solved");
			}
		
		
			
	
		System.out.println("conn1 terminated");
	}

}
