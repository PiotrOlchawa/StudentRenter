package org.mounting.studentrent.domain.rentier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RENTIER")
public class Rentier {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    private Integer id;

    @Column(name = "RENTIER_NAME", unique = true)
    private String rentierName;

    @OneToMany(
            targetEntity = RentierLocalPreferences.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "rentier"
    )
    private List<RentierLocationPreferences> rentierLocationPreferences;

    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(name ="RENTIER_LOCAL_PREFERENCES_ID")

    private RentierLocalPreferences rentierMasterPreferences;
}
