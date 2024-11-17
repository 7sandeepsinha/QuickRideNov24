package dev.sandeep.QuickRideDemo.model;

import dev.sandeep.QuickRideDemo.model.constants.VEHICLETYPE;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private String company;
    private String model;
    private int totalCapacity;
    private String color;
    @Enumerated(EnumType.ORDINAL)
    private VEHICLETYPE vehicletype;
}
