package dev.sandeep.QuickRideDemo.repository;

import dev.sandeep.QuickRideDemo.model.Driver;
import dev.sandeep.QuickRideDemo.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}
