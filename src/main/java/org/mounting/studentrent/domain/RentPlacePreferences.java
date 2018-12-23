package org.mounting.studentrent.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RentPlacePreferences {

    private Integer id;
    private Integer distance;
    private Integer rooms;
}
