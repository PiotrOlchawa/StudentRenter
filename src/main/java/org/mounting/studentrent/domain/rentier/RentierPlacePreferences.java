package org.mounting.studentrent.domain.rentier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RentierPlacePreferences {

    private Integer id;
    private Integer distance;
    private Integer rooms;
    private Rentier rentier;
    private RentierPreferences rentierPreferences;
}
