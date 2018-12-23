package org.mounting.studentrent.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LocationPreferences {

    private String adress;
    private String city;
    private String postCode;
    private Rentier rentier;
    private RentPlacePreferences rentPlacePreferences;

}
