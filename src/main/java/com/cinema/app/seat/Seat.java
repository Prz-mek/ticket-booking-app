package com.cinema.app.seat;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Seat {
    @Id
    @SequenceGenerator(name = "seat_sequence", sequenceName = "seat_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_sequence")
    @Column(updatable = false)
    Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    Long roomId;

    @Column(updatable = false)
    Integer number;

    @Column(updatable = false)
    Integer row;

    @Column(nullable = false)
    Boolean isReserved;
}
