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

    @Column(name = "STREET")
    private String street;

    @Column(name = "STREET_NUMBER")
    private Integer streetNumber;

    @Column(name = "APT_NUMBER")
    private Integer aptNumber;

    @Column(name = "POST_CODE")
    private Integer postCode;

    @Column(name = "CITY")
    String City;

    @Column(name = "LAT")
    private Long lat;

    @Column(name = "LON")
    private Long lon;

    @ManyToOne
    @JoinColumn(name = "OFFERER_ID")
    private Offerer offerer;

    @Column(name = "OFFERER_PLACE_STATUS")
    @Enumerated(EnumType.STRING)
    private OffererPlaceStatus offererPlaceStatus;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name ="OFFERED_PLACE_DESCRIPTION_ID" )
    private OffererPlaceDescription offererPlaceDescription;
}
