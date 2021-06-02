import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcTest2
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		try 
		{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatry?useSSL=false","dshah","aryabhatt2488");
			System.out.println("Connection is successful");
			
			PreparedStatement mystmt = myConn.prepareStatement("select * from employees where emp_age>? and emp_domain=?");			
			
			mystmt.setInt(1,20);
			mystmt.setString(2,"developer");
			ResultSet myRs = mystmt.executeQuery();
			
		
			
			while(myRs.next())
			{
				System.out.println(myRs.getString("empid")+" "+myRs.getString("emp_name")+" "+myRs.getString("emp_age")+" "+myRs.getString("emp_domain"));
			}
			
			
		}
		
		catch(Exception ec)
		{
			ec.printStackTrace();
		}
		
		
		
	}

	private static void display(ResultSet myRs) {
		// TODO Auto-generated method stub
		
	}

	private static void displayEmployee(Connection myConn, String string) {
		// TODO Auto-generated method stub
		
	}

}
