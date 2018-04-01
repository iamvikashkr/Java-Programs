import java.sql.*;

public class Display {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
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

			stmt=con.createStatement();
			System.out.println("ststement created");

			rs=stmt.executeQuery("select * from student");

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
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				stmt.close();
				rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
