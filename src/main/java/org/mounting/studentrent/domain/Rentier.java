package org.mounting.studentrent.domain;

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
    private List<LocationPreferences> locationPreferences;
    private RentPlacePreferences rentierMasterPreferences;
}
