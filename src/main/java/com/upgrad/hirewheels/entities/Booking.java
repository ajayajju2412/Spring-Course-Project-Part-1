package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Booking {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId ;

    @Column(nullable = false)
    private Date pickupDate ;

    @Column(nullable = false)
    private Date dropoffDate ;

    @Column(nullable = false)
    private Date bookingDate ;

    @Column(nullable = false)
    private float amount;

    public Booking() {
    }

    public Booking(Date pickupDate, Date dropoffDate, Date bookingDate, float amount) {
        this.pickupDate = pickupDate;
        this.dropoffDate = dropoffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
    }
}
