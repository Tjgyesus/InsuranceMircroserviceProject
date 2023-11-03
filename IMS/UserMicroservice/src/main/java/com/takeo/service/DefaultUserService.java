package com.takeo.service;


import com.takeo.entity.User;
import com.takeo.entity.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface DefaultUserService extends UserDetailsService{
	User save(UserDTO userRegisteredDTO);

}
