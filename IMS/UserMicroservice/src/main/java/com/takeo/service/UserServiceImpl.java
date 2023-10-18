package com.takeo.service;

import com.takeo.entity.UserEntity;
import com.takeo.repo.UserEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserEntityRepo userEntityRepo;
    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userEntityRepo.save(userEntity);
    }
}
