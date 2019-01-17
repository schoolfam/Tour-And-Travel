package com.tourAndTravel.guest.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class HotelPackageTourist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int hotel_pack_tour_id;
    @Column
    private int hotel_package_id;
    @Column
    private int tourist_id;
    private Date date;

    public HotelPackageTourist(int hotel_package_id, int tourist_id, Date date) {
        this.hotel_package_id = hotel_package_id;
        this.tourist_id = tourist_id;
        this.date = date;
    }

    public int getHotel_pack_tour_id() {
        return hotel_pack_tour_id;
    }

    public void setHotel_pack_tour_id(int hotel_pack_tour_id) {
        this.hotel_pack_tour_id = hotel_pack_tour_id;
    }

    public int getHotel_package_id() {
        return hotel_package_id;
    }

    public void setHotel_package_id(int hotel_package_id) {
        this.hotel_package_id = hotel_package_id;
    }

    public int getTourist_id() {
        return tourist_id;
    }

    public void setTourist_id(int tourist_id) {
        this.tourist_id = tourist_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HotelPackageTourist() {
    }
}
