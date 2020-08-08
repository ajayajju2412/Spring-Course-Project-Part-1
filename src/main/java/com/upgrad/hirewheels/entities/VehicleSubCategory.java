package com.upgrad.hirewheels.entities;



import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VehicleSubCategory {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubCategoryId ;

    @Column(nullable = false, unique = true)
    private String vehicleSubCategoryName ;

    @Column(nullable = false)
    private double pricePerDay ;

    @ManyToOne
    private VehicleCategory vehicleCategory;

    public VehicleSubCategory() {
    }

    public VehicleSubCategory(String vehicleSubCategoryName, double pricePerDay) {
        this.vehicleSubCategoryName = vehicleSubCategoryName;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "VehicleSubCategory{" +
                "vehicleSubCategoryId=" + vehicleSubCategoryId +
                ", vehicleSubCategoryName='" + vehicleSubCategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
