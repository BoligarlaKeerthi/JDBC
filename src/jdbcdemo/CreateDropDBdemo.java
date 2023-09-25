package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropDBdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		String query="create database demo_database1";
		String query1="use demo_database1";
		String query2="drop database demo_database1";
		Connection con=DriverManager.getConnection(dburl,username,password);
		Statement stmt=con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("data is created successfully");
		stmt.executeUpdate(query1);
		System.out.println("data is selected successfully");
		stmt.executeUpdate(query2);
		System.out.println("data is deleted successfully");
		
		

	}

}
