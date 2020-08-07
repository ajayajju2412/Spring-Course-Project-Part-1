package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users,Integer> {

    //Users saveUser(Users user);
    //Users updateUser(Users user);
    //Users deleteUser(Users user);
    //Optional<Users> getUser(int userId);
    //List<Users> getAllUsers();
}
