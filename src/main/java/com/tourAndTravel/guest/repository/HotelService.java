package com.tourAndTravel.guest.repository;

import com.tourAndTravel.guest.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
   private HotelRepo hotelRepo;

    public Hotel save(Hotel hotel){


        return hotelRepo.save(hotel);
    }


    public void delete(Hotel hotel){
        hotelRepo.delete(hotel);
    }
    public Iterable<Hotel> getAll() {
        return hotelRepo.findAll();
    }

}
