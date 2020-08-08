package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Role;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users,Integer> {
    Users findByRole(Role role);
}
