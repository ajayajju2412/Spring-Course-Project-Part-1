package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserDetailsNotFoundException;

public interface UserService {
    Users createUser(Users user) throws UserAlreadyExistsException;
    Users getUser(String email,String password) throws UserDetailsNotFoundException;

}
