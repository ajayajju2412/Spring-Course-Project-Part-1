package com.upgrad.hirewheels.entities;



import javax.persistence.*;

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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fuelTypeId +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
