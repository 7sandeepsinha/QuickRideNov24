package dev.sandeep.QuickRideDemo.repository;

import dev.sandeep.QuickRideDemo.model.Passenger;
import dev.sandeep.QuickRideDemo.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Integer> {
}
