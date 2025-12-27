package com.firstjdbcprojects;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class ExampleForDDL {
	public static void main(String[] args) {
		String jdbcurl = "jdbc:mysql://localhost:3306/aits";
		String username = "root";
		String password = "Nikhil@Tej2006";
		
		try(Connection c = DriverManager.getConnection(jdbcurl,username,password);
			Statement s = c.createStatement())
		{
			
			String createTable = "CREATE TABLE employee(id INT PRIMARY KEY, name VARCHAR(25), Email VARCHAR(50))";
			s.execute(createTable);
			System.out.println("Table created successfully!!!!");
			
			
			String alterTable = "ALTER TABLE employee ADD COLUMN PhoneNumber VARCHAR(10)";
			s.execute(alterTable);
			System.out.println("Table alterd successfully!");
			
			/*
			String dropTable = "DROP TABLE employee";
			s.execute(dropTable);
			System.out.println("Table dropped successfully!");
			*/
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
