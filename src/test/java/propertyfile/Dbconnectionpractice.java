package propertyfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class Dbconnectionpractice {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//1.step1:Register the driver
		//step2:get the connection
		//step3:write the query
		//step4:execute the query
		
		
		Driver driver = null;
		Connection con = null;
		Statement start = null;
		try {
			driver = new Driver();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("", "root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 start = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "select * from emp";
		try {
			ResultSet result= start.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	
	
	
	
	
	
	}
	
	
}
