import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {

		try {
		ServerSocket ssoc=new ServerSocket(4000);
		System.out.println("server is ready");
		Socket soc=ssoc.accept();
		InputStream sips=soc.getInputStream();
		DataInputStream sdips=new DataInputStream(sips);
		String msg=sdips.readUTF();
		System.out.println(msg);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
