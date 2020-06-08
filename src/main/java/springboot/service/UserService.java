package springboot.service;

import java.util.List;

import springboot.entiry.Users;

public interface UserService {

	 	public void createUser(Users user);
	    public List<Users> getUser();
	    public Users findById(long id);
	    public Users update(Users user);
		public void delete(Users user);

}
