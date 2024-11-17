package dev.sandeep.QuickRideDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Ride extends BaseModel{
    private String source;
    private String destination;
    @ManyToOne
    private Driver driver;
    private int availableSeats;
    private int pricePerSeat;
    private LocalDateTime localDateTime;
}
/*
            1 Driver  - M Rides
            Ride
            rideId  driverId

            1 Passenger - M Booking
            Booking
            bookingId   passengerId

            1 Ride - M Booking
            Booking
            bookingId passengerId rideId

            1 Ride - M passenger
            1 Passenger - M Ride
            M:M

            PassengerId     RideId


            1. Ride and Passenger :
                a. M:M mapping -> Ride and Passenger - mapping table -- skipping A as B is mandatory
                b. Indirect mapping -> Ride and Booking || Booking and Passenger
                                       Ride -> Passenger [doable]
                c. Both


 */
