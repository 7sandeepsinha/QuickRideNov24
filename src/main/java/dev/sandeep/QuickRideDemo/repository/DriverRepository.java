package dev.sandeep.QuickRideDemo.repository;

import dev.sandeep.QuickRideDemo.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
}
