package com.upgrad.hirewheels.entities;



import javax.persistence.*;

@Entity
public class VehicleSubCategory {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubCategoryId ;

    @Column(nullable = false, unique = true)
    private String vehicleSubCategoryName ;

    @Column(nullable = false)
    private double pricePerDay ;

    public VehicleSubCategory() {
    }

    public VehicleSubCategory(String vehicleSubCategoryName, double pricePerDay) {
        this.vehicleSubCategoryName = vehicleSubCategoryName;
        this.pricePerDay = pricePerDay;
    }

    public String getVehicleSubCategoryName() {
        return vehicleSubCategoryName;
    }

    public void setVehicleSubCategoryName(String vehicleSubCategoryName) {
        this.vehicleSubCategoryName = vehicleSubCategoryName;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
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
