import java.sql.*;
import java.util.Scanner;

public class Transaction1 {

	public void trans()
	{
		Connection con=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
		}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		try
		{
		con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","system");
		System.out.println("connection established");
		con.setAutoCommit(false);

		ps1=con.prepareStatement("update SBIBANK set BALANCE=BALANCE-? where ACCNO=?");
		ps2=con.prepareStatement("update SBIBANK se BALANCE=BALANCE+? where ACCNO=?");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter from accno");
		String fan=scan.next();
		System.out.println("enter amount");
		String amt=scan.next();
		System.out.println("enter to accno");
		String tan=scan.next();
		
		ps1.setString(2, fan);
		ps1.setString(1, amt);
		
		ps2.setString(1, amt);
		ps2.setString(2, tan);
		int nora1=ps1.executeUpdate();
		System.out.println(nora1+" rows affected");
		
		int nora2=ps2.executeUpdate();
		System.out.println(
				nora2+" rows affected");
		con.commit();
		}
		catch(Exception e)
		{
			try {
				con.rollback();
				System.out.println("exception occured");
			}
			catch(Exception e1)
			{
			e.printStackTrace();
		}
		}
		finally {
			try {
				con.close();
				ps1.close();
				ps2.close();
				//rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
