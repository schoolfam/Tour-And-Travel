package com.tourAndTravel.guest.repository;
import com.tourAndTravel.guest.model.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepo extends CrudRepository <Hotel,Integer> {
}
