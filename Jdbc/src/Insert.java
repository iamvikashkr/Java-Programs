import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","system");
			System.out.println("connection established");

			ps=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
			System.out.println("enter usn name marks1 marks2 marks3 avg");
			Scanner scan=new Scanner(System.in);
			String usn=scan.next();
			String name=scan.next();
			int marks1=scan.nextInt();
			int marks2=scan.nextInt();
			int marks3=scan.nextInt();
			int avg=scan.nextInt();

			ps.setString(1, usn);
			ps.setString(2, name);
			ps.setInt(3, marks1);
			ps.setInt(4, marks2);
			ps.setInt(5, marks3);
			ps.setInt(6, avg);

			int nora=ps.executeUpdate();
			System.out.println(nora+" rowss affected");
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		finally {
			try {
				con.close();
				ps.close();
				//rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}
