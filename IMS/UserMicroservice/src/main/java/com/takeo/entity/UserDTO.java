package com.takeo.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank(message="please Enter Name")
    private String userName;
    @NotNull(message = "Please Enter password")
    @Size(min=3,message="password should be at list 3 characters")
    private String password;
    @Email(message="Enter valid email")
    private String email;
    @NotNull(message = "Please Enter role")
    private String role;
}


