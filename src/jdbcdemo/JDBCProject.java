package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCProject {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	String dburl="jdbc:mysql://localhost:3306/MyProducts";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(dburl,username,password);
	System.out.println("sucsessfully connected to databases");
	String query="select*from MyProducts where product_id=101";
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next()) 
	{
		System.out.print("product_name :" +rs.getString("product_name") + "\t");
		System.out.print("product_id :" +rs.getString("product_id") + "\t");
		System.out.print("product_quantity :" +rs.getString("product_quantity") + "\t");
		System.out.println("product_price :" +rs.getString("product_price") + "\t");
	}
	con.close();
}
}



