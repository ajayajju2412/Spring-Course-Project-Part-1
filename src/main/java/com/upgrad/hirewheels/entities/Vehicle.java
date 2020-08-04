package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId ;

    @Column(nullable = false)
    private String vehicleModel ;

    @Column(nullable = false)
    private String vehicleNumber ;

    @Column(nullable = false)
    private String color ;

    @Column(nullable = false)
    private int availabilityStatus ;

    @Column(nullable = false)
    private String vehicleImageUrl ;

    public Vehicle() {
    }

    public Vehicle(String vehicleModel, String vehicleNumber, String color, int availabilityStatus, String vehicleImageUrl) {
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.availabilityStatus = availabilityStatus;
        this.vehicleImageUrl = vehicleImageUrl;
    }
}
