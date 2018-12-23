package org.mounting.studentrent.domain.rentier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Rentier {

    private Integer id;
    private String userName;
    private List<RentierPreferences> rentierPreferences;
    private RentierPlacePreferences rentierMasterPreferences;
}
