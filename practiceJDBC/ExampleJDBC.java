package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExampleJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbforexamplejdbc","root","Varma@123");
		if(con!=null) {
			System.out.println("Connected");
		}
		else {
			System.out.println("not connection");
		}
	}
	

}
