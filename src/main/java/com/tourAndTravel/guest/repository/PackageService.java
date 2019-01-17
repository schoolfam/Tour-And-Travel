package com.tourAndTravel.guest.repository;


import com.george.tour.Repositary.PackageRepo;
import com.george.tour.model.HotelPackages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageService {
    @Autowired
    private PackageRepo packageRepo;

    public HotelPackages save(HotelPackages hotelPackages){


        return packageRepo.save(hotelPackages);
    }


    public void delete(HotelPackages hotel){
        packageRepo.delete(hotel);
    }
    public Iterable<HotelPackages> getAll() {
        return packageRepo.findAll();
    }

}
