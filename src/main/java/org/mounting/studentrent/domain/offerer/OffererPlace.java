package org.mounting.studentrent.domain.offerer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OffererPlace {

    private Integer id;
    private Long lat;
    private Long lon;
    private Offerer offerer;
    private OffererPlaceStatus offererPlaceStatus;
    private OffererPlaceDescription rentierPlacePreferences;
}
