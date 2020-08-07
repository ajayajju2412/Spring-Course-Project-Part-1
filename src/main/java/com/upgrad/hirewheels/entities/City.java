package com.upgrad.hirewheels.entities;



import javax.persistence.*;



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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
