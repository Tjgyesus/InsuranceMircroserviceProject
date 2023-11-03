package com.takeo.service;


import com.takeo.entity.User;
import com.takeo.entity.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface DefaultUserService extends UserDetailsService{
	User save(UserDTO userRegisteredDTO);

}
