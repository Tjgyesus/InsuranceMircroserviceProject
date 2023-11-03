package com.takeo.controller;

import com.takeo.entity.User;
import com.takeo.service.DefaultUserService;
import com.takeo.service.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/admin/api/user")
public class AdminProfileController {
    private static final Logger LOGGER = LogManager.getLogger(AdminProfileController.class);
        @Autowired
        private UserServiceImpl daoService;

    @Autowired
    DefaultUserService userService;

        @GetMapping("/view_all")
        public ResponseEntity<List<User>> getAllClaim() {
            List<User> claim = daoService.getAllUsers();
            LOGGER.info("getALL API is called.");
            return new ResponseEntity<>(claim, HttpStatus.OK);
        }
            @GetMapping("/profile")
            public ResponseEntity<User> readUser() {

                return new ResponseEntity<User>(daoService.readUser(), HttpStatus.OK);
            }

            @PutMapping("/updateprofile")
            public ResponseEntity<User> updateUser(@RequestBody User user) {
                return new ResponseEntity<User>(daoService.updateUser(user), HttpStatus.OK);
            }

            @DeleteMapping("/deactivate")
            public ResponseEntity<HttpStatus> deleteUser() {
                daoService.deleteUser();
                return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
            }
        }

