package practiceDaoDto1;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private List<UserDTO> users= new ArrayList<>();
	
	public void addUser(UserDTO user) {
		users.add(user);
	}
	
	public List<UserDTO> getAllUsers(){
		return users;
	}
	
	public UserDTO getUserById(int id) {
		for(UserDTO user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public void updateUser(UserDTO user) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getId()==user.getId()) {
				users.set(i,user);
				break;
			}
		}
	}
	
	public void deleteUser(int id) {
		users.removeIf(user -> user.getId()==id);
	}
}
