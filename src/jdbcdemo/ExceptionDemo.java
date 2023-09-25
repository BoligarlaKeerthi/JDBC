package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "Call allmovies1()";
		
		Connection con = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query); 
		
	
		while(rs.next()) {
			
			System.out.print("title: " + rs.getString("title") + "\t");
			System.out.print("genre: " + rs.getString("genre") + "\t");
			System.out.print("director: " + rs.getString("director") + "\t");
			System.out.println("release_year: " + rs.getString("release_year") + "\t");
		}
		

	}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
		finally {
			con.close();
		}
	}	


	}


