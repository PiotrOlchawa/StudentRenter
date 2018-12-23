package org.mounting.studentrent.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RentPreference {

    Integer id;
    Integer distance;
    Integer rooms;
    User user;

}
