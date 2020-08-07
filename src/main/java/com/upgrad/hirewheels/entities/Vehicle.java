package com.upgrad.hirewheels.entities;



import javax.persistence.*;


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

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", color='" + color + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }
}
