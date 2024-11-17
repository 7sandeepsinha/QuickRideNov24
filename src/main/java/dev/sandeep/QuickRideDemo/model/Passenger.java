package dev.sandeep.QuickRideDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "QUICKRIDE_PASSENGER")
public class Passenger extends User {
    private double rating;
    @OneToMany
    private List<Booking> bookings;
}
