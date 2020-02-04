package com.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC 
{
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		//Steps 1
		
		//create a driver class object and load the driver class dynamically 
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create connection object 
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shantu", "rootsh", "root");
		//create statement object 
		
		Statement stmt = conn.createStatement();
		
		//execute query 
		
		ResultSet results = stmt.executeQuery("select * from PERSONS");
		
		while(results.next()) 
		{
			
			System.out.println(" "+results.getInt(1));
			
		}
		
		conn.close();
		
		
		
	}

}
