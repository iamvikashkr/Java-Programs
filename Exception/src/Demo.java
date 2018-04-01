import java.util.Scanner;

public class Demo {

	public void div() throws Exception
	{
		System.out.println("con  2 established");
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("enetr two nos");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);

		}
		catch(Exception e)
		{
			System.out.println("issue solved");
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw e;
		}
		finally
		{
			System.out.println("con 2 terminated");
		}
	}
}
