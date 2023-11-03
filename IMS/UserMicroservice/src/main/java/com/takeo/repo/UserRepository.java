package com.takeo.repo;

import com.takeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String username);
	User findByEmail(String email);

}
