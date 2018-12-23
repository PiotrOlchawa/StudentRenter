package org.mounting.studentrent.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RentPlaces {

    Integer id;
    Long lat;
    Long lon;
    RentStatus rentStatus;

}
