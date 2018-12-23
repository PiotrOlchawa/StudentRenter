package org.mounting.studentrent.domain.offerer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Offerer {

    private Integer id;
    private String userName;
    private List<OffererPlace> offererPlaces;
}
