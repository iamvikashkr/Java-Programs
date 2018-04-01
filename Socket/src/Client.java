import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			Socket csoc =new Socket("localhost",4000);
			OutputStream cops=csoc.getOutputStream();
			DataOutputStream cdops= new DataOutputStream(cops);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter msg");
			String msg=scan.nextLine();
			cdops.writeUTF(msg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
