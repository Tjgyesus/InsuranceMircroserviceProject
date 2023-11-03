package com.takeo.repo;

import com.takeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);

}
