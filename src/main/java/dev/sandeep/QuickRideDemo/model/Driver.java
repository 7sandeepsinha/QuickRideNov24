package dev.sandeep.QuickRideDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "QUICKRIDE_DRIVER")
public class Driver extends User{
    private String drivingLicenseNumber;
    private double rating;
    @OneToMany
    @JoinColumn(name = "driver_id")
    private List<Vehicle> vehicles;
    @OneToMany
    @JoinColumn(name = "driver_id")
    private List<Ride> rides;
}
