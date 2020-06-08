package springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.dao.UserRepository;
import springboot.entiry.Users;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void createUser(Users user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public List<Users> getUser() {
		// TODO Auto-generated method stub
		return (List<Users>) userRepository.findAll();
	}

	@Override
	public Users findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public Users update(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
	}



}
