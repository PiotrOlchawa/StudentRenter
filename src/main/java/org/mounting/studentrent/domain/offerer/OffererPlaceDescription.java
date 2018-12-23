package org.mounting.studentrent.domain.offerer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "OFFERED_PLACE_DESCRIPTION")
public class OffererPlaceDescription {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DISTANCE")
    @NotNull
    private Integer distance;
    @Column(name = "ROOMS")
    private Integer rooms;
}
