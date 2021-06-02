import java.sql.*;
public class JdbcTest
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		try 
		{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatry?useSSL=false","dshah","aryabhatt2488");
			System.out.println("Connection is successful");
			
			Statement mystmt = myConn.createStatement();
			
			int rowsAffected = mystmt.executeUpdate("insert into employees"+
													"(emp_name,emp_age,emp_domain)"+
													"values"+
													"('Saran Sharma',25,'maintenance'),('Sahaj parekh',45,'human resource')");
			
			
			int rowsAffected1 = mystmt.executeUpdate("update employees "+"set emp_age = 28 "+"where emp_name like '%Dhruv%'");
					
			//int rowsAffected2 = mystmt.executeUpdate("delete from employees"+"where emp_name like '%Dhruv Shah'");
			
			ResultSet myRs = mystmt.executeQuery("Select * from employees order by emp_Age");
			
			
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

	private static void displayEmployee(Connection myConn, String string) {
		// TODO Auto-generated method stub
		
	}

}
