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
@Table(name = "OFFERER_PLACE")
public class OffererPlace {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    @NotNull
    private Integer id;
    @Column(name = "LAT")
    @NotNull
    private Long lat;
    @Column(name = "LON")
    @NotNull
    private Long lon;
    @JoinColumn(name = "OFFERER_ID")
    @ManyToOne
    private Offerer offerer;
    @Column(name = "OFFERER_PLACE_STATUS")
    @Enumerated(EnumType.STRING)
    private OffererPlaceStatus offererPlaceStatus;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name ="OFFERED_PLACE_DESCRIPTION_ID" )
    private OffererPlaceDescription rentierPlacePreferences;
}
