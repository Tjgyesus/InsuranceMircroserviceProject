package com.takeo.repo;

import com.takeo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {
}
