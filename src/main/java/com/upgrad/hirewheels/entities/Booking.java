package com.upgrad.hirewheels.entities;



import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId ;

    @Column(nullable = false)
    private Date pickupDate ;

    @Column(nullable = false)
    private Date dropOffDate ;

    @Column(nullable = false)
    private Date bookingDate ;

    @Column(nullable = false)
    private double amount;

    public Booking() {
    }

    public Booking(Date pickupDate, Date dropoffDate, Date bookingDate, double amount) {
        this.pickupDate = pickupDate;
        this.dropOffDate = dropoffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropoffDate(Date dropoffDate) {
        this.dropOffDate = dropoffDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
