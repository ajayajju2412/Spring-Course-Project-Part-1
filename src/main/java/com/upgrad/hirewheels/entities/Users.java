package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    @Column(nullable = false)
    private String firstName ;

    private String lastName ;

    @Column(nullable = false, columnDefinition = "VARCHAR2(50) CHECK (LENGTH(password)>5)")
    private String password ;

    @Column(nullable = false, unique = true)
    private String email ;

    @Column(nullable = false, unique = true)
    private String mobileNo ;

    @Column(columnDefinition = "NUMBER(10,2) DEFAULT 10000.00")
    private float walletMoney ;

    public Users() {
    }

    public Users(String firstName, String lastName, String password, String email, String mobileNo, int walletMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.walletMoney = walletMoney;
    }
}
