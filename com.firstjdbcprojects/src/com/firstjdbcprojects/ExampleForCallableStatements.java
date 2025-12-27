package com.firstjdbcprojects;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;
public class ExampleForCallableStatements {

	public static void main(String[] args) {
		String jdbcurl = "jdbc:mysql://localhost:3306/Aits";
		String username = "root";
		String password = "Nikhil@Tej2006";
		
		String studentid = "S111";
		String callProcedure = "{CALL getCreditObtained(?)}";
		
		try(Connection c = DriverManager.getConnection(jdbcurl,username,password);
				CallableStatement cs = c.prepareCall(callProcedure))
		{
			cs.setString(1, studentid);
			ResultSet result = cs.executeQuery();
			
			while(result.next())
			{
				String id = result.getString("studentid");
				String email = result.getString("email");
				System.out.println("ID:" +id+ ",Email:" +email);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
