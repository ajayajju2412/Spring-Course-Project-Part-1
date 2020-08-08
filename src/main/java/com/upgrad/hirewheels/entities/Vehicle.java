package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
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

    @ManyToOne
    private Location location;

    @ManyToOne
    private FuelType fuelType;

    @Column(nullable = false)
    private int availabilityStatus ;

    @Column(nullable = false)
    private String vehicleImageUrl ;

    @OneToMany(mappedBy = "vehicle",cascade = CascadeType.ALL)
    private List<Booking> booking ;



    public Vehicle() {
    }

    public Vehicle(String vehicleModel, String vehicleNumber, String color, int availabilityStatus, String vehicleImageUrl) {
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.availabilityStatus = availabilityStatus;
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
