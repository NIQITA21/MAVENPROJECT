package Querypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Executequery {
	public static void main(String[] args) throws SQLException {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root", "root");
		Statement stat = con.createStatement();
		ResultSet result = stat.executeQuery("select * from customer");
		while(result.next())
		{
			System.out.println(result.getString(1)+"\t"+result.getString(1));
		}
		con.close();//mandatory for security 
	}

}
