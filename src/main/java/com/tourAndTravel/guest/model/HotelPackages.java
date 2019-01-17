package com.tourAndTravel.guest.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data

public class HotelPackages {

     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "id")

     private int id;
    @NotBlank
    @Column(name = "package_name")
    private String package_name;
    @Column(name = "hotel_id")
    private int hotel_id;
    @Column(name = "hotel_package_id")
    private int hotel_package_id;
    @Column(name = "number_of_adults")

    private int numbe_of_adults;
    @Column(name = "number_of_childrens")

    private int numbe_of_childrens;
    @Column(name = "description")

    private String  description;
    @Column(name = "stay_amount")

    private int stay_amount;
    @Column(name = "food_amount")

    private int food_amount;
    @Column(name = "path")

    private String path;
    @Column(name = "number_days")

    private int number_days;
    @Column(name = "number_of_nights")

    private int number_nights;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getHotel_package_id() {
        return hotel_package_id;
    }

    public void setHotel_package_id(int hotel_package_id) {
        this.hotel_package_id = hotel_package_id;
    }

    public int getNumbe_of_adults() {
        return numbe_of_adults;
    }

    public void setNumbe_of_adults(int numbe_of_adults) {
        this.numbe_of_adults = numbe_of_adults;
    }

    public int getNumbe_of_childrens() {
        return numbe_of_childrens;
    }

    public void setNumbe_of_childrens(int numbe_of_childrens) {
        this.numbe_of_childrens = numbe_of_childrens;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStay_amount() {
        return stay_amount;
    }

    public void setStay_amount(int stay_amount) {
        this.stay_amount = stay_amount;
    }

    public int getFood_amount() {
        return food_amount;
    }

    public void setFood_amount(int food_amount) {
        this.food_amount = food_amount;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getNumber_days() {
        return number_days;
    }

    public void setNumber_days(int number_days) {
        this.number_days = number_days;
    }

    public int getNumber_nights() {
        return number_nights;
    }

    public void setNumber_nights(int number_nights) {
        this.number_nights = number_nights;
    }

    public HotelPackages(String package_name, int hotel_id, int hotel_package_id, int numbe_of_adults, int numbe_of_childrens, String description, int stay_amount, int food_amount, String path, int number_days, int number_nights) {
        this.package_name = package_name;
        this.hotel_id = hotel_id;
        this.hotel_package_id = hotel_package_id;
        this.numbe_of_adults = numbe_of_adults;
        this.numbe_of_childrens = numbe_of_childrens;
        this.description = description;
        this.stay_amount = stay_amount;
        this.food_amount = food_amount;
        this.path = path;
        this.number_days = number_days;
        this.number_nights = number_nights;
    }

    public HotelPackages() {
    }
}
