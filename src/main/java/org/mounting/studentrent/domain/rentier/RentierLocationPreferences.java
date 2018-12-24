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
@Table(name = "RENTIER_LOCATION_PREFERENCES")
public class RentierLocationPreferences {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    @NotNull
    private Integer id;

    @Column(name = "ADRESS")
    private String adress;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POST_CODE")
    private String postCode;

    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "RENTIER_ID")
    private Rentier rentier;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "RENTIER_LOCAL_PREFERENCES_ID")
    private RentierLocalPreferences rentierLocalPreferences;

}
