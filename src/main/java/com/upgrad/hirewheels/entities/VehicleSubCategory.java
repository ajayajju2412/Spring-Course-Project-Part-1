package com.upgrad.hirewheels.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class VehicleSubCategory {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubCategoryId ;

    @Column(nullable = false, unique = true)
    private String vehicleSubCategoryName ;

    @Column(nullable = false)
    private float pricePerDay ;


}
