package com.firstjdbcprojects;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExamples {
	public static void main(String[] args) {
		String jdbcurl = "jdbc:mysql://localhost:3306/Aits";
		String username = "root";
		String password = "Nikhil@Tej2006";
		
		try {
		
			Connection c = DriverManager.getConnection(jdbcurl,username, password);
			System.out.println("Connection Successful");
			Statement s = c.createStatement();
			
			/*
			String createTable = "CREATE TABLE user(id INT primary key, name VARCHAR(10))";
			s.execute(createTable);
			System.out.println("Table created successfully");	*/
			
			/*
			//Insert data 
			String insertData = "INSERT INTO user(id,name) VALUES(1, 'NIKHIL'),(2,'TEJ')";
			int rowsAffected = s.executeUpdate(insertData);
			System.out.println(rowsAffected+" records inserted successfully");
			
			//Retrieve the Data
			String retrieveData = "SELECT * FROM user";
			s.executeQuery(retrieveData);
			*/
			
			
			String retrieve = "SELECT FirstName, LastName,Phone, Email FROM Student";
			//String retieve_numeric_data = "SELECT Phone FROM Student" ;
			ResultSet result = s.executeQuery(retrieve);
			
			//Iterate over the ResutSet
			while(result.next()) {
				String FirstName = result.getString("FirstName");
				String LastName = result.getString("LastName");
				String PhoneNumber = result.getString("Phone");
				String Email = result.getString("Email");
				System.out.println("FirstName:" + FirstName+ ", LastName:" + LastName+  ", PhoneNumber:" +PhoneNumber+ ", Email:" + Email);
				
			}
			
			s.close();
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	
}
