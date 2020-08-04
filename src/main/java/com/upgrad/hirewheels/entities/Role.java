package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId ;

    @Column(nullable = false, unique = true)
    private String roleName ;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
