package springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springboot.entiry.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
