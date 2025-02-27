package practiceDaoDto1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO userDAO = new UserDAO();
			
		userDAO.addUser(new UserDTO(1, "nvm varma", "varma@example.com"));
	        userDAO.addUser(new UserDTO(2, "tvv raana", "ramana@mail.com"));
	        
	        System.out.println("All Users: " + userDAO.getAllUsers());
	        
	        System.out.println("user with id 1 :" +userDAO.getUserById(1));
	        
	        userDAO.updateUser(new UserDTO(2,"tvv ramana", "ramana@mail.com"));
	        System.out.println("updated user : "+userDAO.getUserById(2));
	        
	        userDAO.deleteUser(2);
	        System.out.println("after deletion : "+userDAO.getAllUsers());


	}

}
