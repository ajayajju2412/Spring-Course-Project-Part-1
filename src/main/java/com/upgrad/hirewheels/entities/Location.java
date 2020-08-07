package com.upgrad.hirewheels.entities;



import javax.persistence.*;

@Entity
public class Location {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId ;

    @Column(nullable = false)
    private String locationName ;

    @Column(nullable = false)
    private String address ;

    @Column(nullable = false)
    private String pincode ;

    public Location() {
    }

    public Location(String locationName, String address, String pincode) {
        this.locationName = locationName;
        this.address = address;
        this.pincode = pincode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
