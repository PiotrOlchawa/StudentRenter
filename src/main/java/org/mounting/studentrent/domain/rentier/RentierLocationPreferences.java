package org.mounting.studentrent.domain.rentier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RentierLocationPreferences {

    private Integer id;
    private String adress;
    private String city;
    private String postCode;
    private Rentier rentier;
    private RentierLocalPreferences rentierLocalPreferences;

}
