package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Location {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId ;

    @Column(nullable = false)
    private String locationName ;

    @Column(nullable = false)
    private String address ;

    @Column(nullable = false)
    private String pincode ;
}
