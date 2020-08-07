package com.upgrad.hirewheels.entities;



import javax.persistence.*;


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

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicleCategoryId=" + vehicleCategoryId +
                ", vehicleCategoryName='" + vehicleCategoryName + '\'' +
                '}';
    }
}
