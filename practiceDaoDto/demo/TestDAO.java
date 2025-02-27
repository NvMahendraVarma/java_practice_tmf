package practiceDaoDto.demo;

import java.sql.SQLException;

public class TestDAO {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		
		StudentDTO student = new StudentDTO(101,"varma");
		try {
			boolean result = dao.addStudent(student);
			System.out.println("addStudent result : "+result);
			
			StudentDTO fetchedStudent = dao.getStudent(101);
			System.out.println("fethedStudent : "+fetchedStudent);
			
			student.setSname("nvm varma");
			boolean updateResult = dao.updateStudent(student);
			System.out.println("updateStudent result : "+updateResult);
			
			boolean deleteResult=dao.deleteStudent(101);
			System.out.println("deleteStudent result : "+deleteResult);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
