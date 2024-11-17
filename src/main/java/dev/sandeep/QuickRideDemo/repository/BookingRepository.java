package dev.sandeep.QuickRideDemo.repository;

import dev.sandeep.QuickRideDemo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
