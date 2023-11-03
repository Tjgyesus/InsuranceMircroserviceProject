package com.takeo.service;
import com.takeo.entity.User;

import java.util.List;

public interface UserService {
    User readUser();

    User updateUser(User user);

    void deleteUser();

    User getLoggedInUser();
    List<User> getAllUsers();
    public boolean emailExists(String email);


}
