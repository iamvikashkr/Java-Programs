import java.sql.*;
import java.util.Scanner;

public class SbiOnline {

	public static void main(String[] args) {
		System.out.println("Hello! welcome to SBI online Banking");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. To check Balance");
		System.out.println("2. To register");
		System.out.println("3. Transaction");
		System.out.println("4. exit");
		String usr;
		String pwd;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int n=scan.nextInt();
		switch(n)
		{
		case 1: try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				try
				{
				con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","system");
				System.out.println("connection established");
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				try {
				ps=con.prepareStatement("select BALANCE from SBIBANK where ACCNO=? AND PWD=?");
				
				System.out.println("Enter account number");
				usr=scan.next();
				System.out.println("Enter password");
			    pwd=scan.next();
			    ps.setString(1, usr);
			    ps.setString(2, pwd);
			    
			    rs= ps.executeQuery();
			    while(rs.next()==true)
			    {
			    	
			    	String e=rs.getString("BALANCE");
			    	//String e=rs.getString(1);
					System.out.println(e);

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
			    
				break;
		case 2:  try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				try
				{
				con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","system");
				System.out.println("connection established");
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				try {
				ps=con.prepareStatement("INSERT INTO SBIBANK VALUES(?,?,?,?,?)");
				
				System.out.println("Enter account number");
				usr=scan.next();
				System.out.println("Enter password");
			    pwd=scan.next();
			    System.out.println("name");
			    String name=scan.next();
			    System.out.println("type");
			    String type=scan.next();
			    System.out.println("balance");
			    String balance=scan.next();
			    
			    ps.setString(1, usr);
			    ps.setString(2, pwd);
			    ps.setString(3, name);
			    ps.setString(4, type);
			    ps.setString(5, balance);
			    
			    int nora=ps.executeUpdate();
			    System.out.println(nora+" rows affected");
				}
		
				catch(SQLException e)
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
				break;
		case 3: Transaction1 t=new Transaction1();
				t.trans();
				break;
				
				
		case 4:System.out.println("Thanku you for using SBI");
		       break;
		default:  System.out.println("Incorrect choice");
		          System.exit(0);
		}
	}

}
