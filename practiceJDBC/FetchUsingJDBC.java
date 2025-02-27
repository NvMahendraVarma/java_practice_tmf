package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchUsingJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbforexamplejdbc","root","Varma@123");
		String query = "select*from Student";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			rs.getInt(1);
			System.out.println(rs.getInt("sid"));
			rs.getString(2);
			System.out.println(rs.getString("sname"));
		}
	}

}
