import java.sql.*;
import java.util.Scanner;

public class Specific_row {

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

			ps=con.prepareStatement("select * from student where usn=?");
			Scanner scan=new Scanner(System.in);

			System.out.println("Enter usn");
			String usn=scan.next();

			ps.setString(1, usn);
			rs=ps.executeQuery();
			while(rs.next()==true)
			{
				String a=rs.getString(1);
				String b=rs.getString(2);
				int c=rs.getInt(3);
				int d=rs.getInt(4);
				int e=rs.getInt(5);
				int f=rs.getInt(6);
				System.out.println(a+" "+b+" "+c+" "+d+" "+e+ " "+f);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
				rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
