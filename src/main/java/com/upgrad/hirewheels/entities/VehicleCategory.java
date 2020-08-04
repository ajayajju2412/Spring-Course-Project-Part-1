package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class VehicleCategory {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleCategoryId ;

    @Column(nullable = false, unique = true)
    private String vehicleCategoryName ;

    public VehicleCategory() {
    }

    public VehicleCategory(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }
}
