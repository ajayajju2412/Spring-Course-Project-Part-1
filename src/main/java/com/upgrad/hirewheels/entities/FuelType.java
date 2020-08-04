package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class FuelType {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuelTypeId ;

    @Column(nullable = false, unique = true)
    private String fuelType ;

    public FuelType() {
    }

    public FuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
