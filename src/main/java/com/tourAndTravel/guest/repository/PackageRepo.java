package com.tourAndTravel.guest.repository;

import com.george.tour.model.HotelPackages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepo extends JpaRepository<HotelPackages,Integer> {
}
