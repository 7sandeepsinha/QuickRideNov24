package dev.sandeep.QuickRideDemo.model;

import dev.sandeep.QuickRideDemo.model.constants.GENDER;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class User extends BaseModel {
    private String name;
    private String email;
    private String phoneNumber;
    private String govtIdNumber;
    @Enumerated(EnumType.STRING)
    private GENDER gender;
}
