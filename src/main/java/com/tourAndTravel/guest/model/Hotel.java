package com.tourAndTravel.guest.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int hotel_id;
    @Column(name = "hotel_id")
    private String hotel_name;
    @Column(name = "user_id")
    private int user_Id;
    @Column(name = "standard")
    private int standard;

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public Hotel(String hotel_name, int user_Id, int standard) {
        this.hotel_name = hotel_name;
        this.user_Id = user_Id;
        this.standard = standard;
    }

    public Hotel() {
    }

}