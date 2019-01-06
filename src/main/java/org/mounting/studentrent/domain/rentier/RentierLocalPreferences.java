package org.mounting.studentrent.domain.rentier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RENTIER_LOCAL_PREFERENCES")
public class RentierLocalPreferences {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    @NotNull
    private Integer id;

    @Column(name = "DISTANCE")
    private Integer distance;

    @Column(name = "ROOMS")
    private Integer rooms;

    @ManyToOne
    @JoinColumn(name = "RENTIER_ID")
    private Rentier rentier;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "RENTIER_LOCATION_PREFERENCES_ID")
    private RentierLocationPreferences rentierLocationPreferences;
}
