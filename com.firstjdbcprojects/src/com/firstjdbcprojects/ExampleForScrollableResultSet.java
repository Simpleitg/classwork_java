package com.firstjdbcprojects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ExampleForScrollableResultSet {

	public static void main(String[] args) {
		String jdbcurl = "jdbc:mysql://localhost:3306/Aits";
		String username = "root";
		String password = "Nikhil@Tej2006";
		
		try(Connection c = DriverManager.getConnection(jdbcurl,username, password);
		    Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY))
		{
		
			String retrieve = "SELECT StudentId, FirstName, LastName FROM Student";
			ResultSet result = s.executeQuery(retrieve);
			
			
			//----Move the cursor to the last row----
			result.last();
			//retrieve data from last row
			String lastId = result.getString("Studentid");
			String fname = result.getString("FirstName");
			String lname = result.getString("LastName");
			System.out.println("----Last Row from DataBase using last() method in result on ResultSet:\n");
			System.out.println("\t\t"+"Student ID:" +lastId+ ", FirstName:" + fname+ ", LastName:" + lname+"\n");
			
			//----Move the cursor to the first row----
			result.first();
			//retrieve data from first row
			String firstId = result.getString("Studentid");
			fname = result.getString("FirstName");
			lname = result.getString("LastName");
			System.out.println("----First Row from DataBase using first() method in result on ResultSet:\n");
			System.out.println("\t\t"+ "Student ID:" +firstId+ ", FirstName:" + fname+ ", LastName:" + lname+ "\n");
			
			//----Move the cursor to the absolute row----
			result.absolute(2);
			//retrieve data from absolute row
			String AbsoluteId = result.getString("Studentid");
			fname = result.getString("FirstName");
			lname = result.getString("LastName");
			System.out.println("----Using Absolute with specifying rows to capture from DataBase:\n");
			System.out.println("\t\t"+"Student ID:" +AbsoluteId+ ", FirstName:" + fname+ ", LastName:" + lname);
			
			s.close();
			c.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}

}
