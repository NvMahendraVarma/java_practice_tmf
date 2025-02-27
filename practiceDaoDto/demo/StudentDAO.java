package practiceDaoDto.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
    }
    
    public boolean addStudent(StudentDTO student) throws SQLException {
    	String query="INSERT INTO student_details (sid,sname) VALUES(?,?)";
    	try (Connection con = getConnection();PreparedStatement ps = con.prepareStatement(query)){
    		ps.setInt(1,student.getSid());
    		ps.setString(2,student.getSname());
    		int result=ps.executeUpdate();
    		return result>0;
    		
    	}
    }
    
    public StudentDTO getStudent(int sid) throws SQLException {
    	String query="SELECT*FROM Student_details where sid=?";
    	try(Connection con = getConnection();PreparedStatement ps = con.prepareStatement(query)){
    		ps.setInt(1,sid);
    		ResultSet rs = ps.executeQuery();
    		if(rs.next()) {
    			return new StudentDTO(rs.getInt("sid"),rs.getString("sname"));
    		}
    		return null;
    	}
    }
    
    public boolean updateStudent(StudentDTO student) throws SQLException {
    	String query="UPDATE student_details SET sname=? where sid=?";
    	try(Connection con = getConnection();PreparedStatement ps = con.prepareStatement(query)){
    		ps.setString(1,student.getSname());
    		ps.setInt(2,student.getSid());
    		int result = ps.executeUpdate();
    		return result>0;
    	}
    }
    
    public boolean deleteStudent(int sid) throws SQLException {
    	String query="DELETE FROM student_details where sid=?";
    	try(Connection con = getConnection();PreparedStatement ps =con.prepareStatement(query)){
    	ps.setInt(1,sid);
    	int result=ps.executeUpdate();
    	return result>0;
    	
    	}
    }
    
    public List<StudentDTO> getAllStudents() throws SQLException{
    	List<StudentDTO> students = new ArrayList<>();
    	String query="SELECT*FROM student_details";
    	try(Connection con = getConnection();PreparedStatement ps = con.prepareStatement(query);){
    		ResultSet rs = ps.executeQuery();
    		while(rs.next()) {
    			students.add(new StudentDTO(rs.getInt("sid"),rs.getString("sname")));
    		}
    	}
    	return students;
    }
    
}
