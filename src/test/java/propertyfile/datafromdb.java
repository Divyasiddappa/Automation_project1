package propertyfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class datafromdb {

	public static void main(String[] args) throws SQLException 
	{
		
		//step1:create the object for the driver
		Driver dbdriver=new Driver();
		//step2:register the driver to instance to the jdbc
		
		DriverManager.registerDriver(dbdriver);
		//step3:get/establish the database connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
		try
		{
			//step4: create the statement
			 Statement statement = connection.createStatement();
			 //step5:execute the query
			 ResultSet result =statement.executeQuery("select * from sdet1;");
			// step6:verify or iterate or fetch the data
			 while(result.next())
			 {
				 System.out.println(result.getString("emp_name"));
				 
			 }
		}
			 //step7:close the db connection
			 finally
			 {
				 connection.close();//mandatory
				 System.out.println("connection closed successfully");
			 }
			
		
	}

}
