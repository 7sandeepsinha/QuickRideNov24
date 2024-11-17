package dev.sandeep.QuickRideDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @ManyToOne
    private Passenger passenger;
    @ManyToOne
    private Ride ride;
    private double driverRating;
    private double passengerRating;
    private double cost;
    private LocalDateTime bookingTimestamp;
}
/*
    Booking Passenger : M:1
    1       1
    M       1

    Booking Ride :  M:1
    1       1
    M       1
 */