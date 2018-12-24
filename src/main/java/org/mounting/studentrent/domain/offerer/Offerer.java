package org.mounting.studentrent.domain.offerer;

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
@Table(name = "OFFERER")
public class Offerer {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    @NotNull
    private Integer id;

    @Column(name = "USERNAME")
    @NotNull
    private String userName;

    @OneToMany(
            targetEntity = OffererPlace.class,
            mappedBy = "offerer",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<OffererPlace> offererPlaces;
}
