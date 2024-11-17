package dev.sandeep.QuickRideDemo.repository;

import dev.sandeep.QuickRideDemo.model.Driver;
import dev.sandeep.QuickRideDemo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
