package com.firstjdbcprojects;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class EampleForPreaparedStatements {

	public static void main(String[] args) {
		String jdbcurl = "jdbc:mysql://localhost:3306/Aits";
		String username = "root";
		String password = "Nikhil@Tej2006";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int id = s.nextInt();
		System.out.println("Enter Employee Name:");
		String name = s.next();
		System.out.println("Enter Employee Email:");
		String email= s.next();
		System.out.println("Enter Employee PhoneNumber:");
		String phoneNumber = s.next();
		
		
		
		/*
		int id = 2;
		String name = "Nikhil";
		String email = "nikhil@gmail.com";
		String phoneNumber = "7689033012";*/
		
		String insert  = "INSERT INTO employee(id,name,email,phoneNumber) VALUES(?,?,?,?)";
		
		try(Connection c = DriverManager.getConnection(jdbcurl,username,password);
			PreparedStatement p = c.prepareStatement(insert))
		{
			p.setInt(1,id);
			p.setString(2, name);
			p.setString(3,  email);
			p.setString(4,  phoneNumber);
		
		int rowsAffected = p.executeUpdate();
		
		if(rowsAffected > 0)
		{
			System.out.println("Record Inserted Successfully!");
		}
		else {
			System.out.println("Failed to Insert the record!");
		}
		c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}

