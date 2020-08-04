package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
public class City {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId ;

    @Column(nullable = false)
    private String cityName ;

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }
}
