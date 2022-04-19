package com.cinema.app.screening;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Screening {
    @Id
    @SequenceGenerator(name = "screening_sequence", sequenceName = "screening_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_sequence")
    @Column(updatable = false)
    Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    Long roomId;

    @Column
    Date start;

    // in minutes
    @Column
    Integer duration;
}
