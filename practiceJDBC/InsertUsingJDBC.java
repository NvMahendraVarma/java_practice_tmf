package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUsingJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbforexamplejdbc","root","Varma@123");
		
		if(con!=null) {
			System.out.println("connected");
			String query="insert into Student values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,103);
			ps.setString(2,"alekhya");
			
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Record Inserted Successfully!");
            } else {
                System.out.println("Insertion Failed!");
            }
            
            ps.close();
            con.close();
            
		}
		else {
			System.out.println("connction not done");
		}
		
	}

}
