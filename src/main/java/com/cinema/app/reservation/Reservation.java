package com.cinema.app.reservation;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Reservation {
    @Id
    @SequenceGenerator(name = "room_sequence", sequenceName = "room_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_sequence")
    Long id;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    Long screeningId;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    Long seatId; //???

    @Column
    TicketType type;

    @Column
    String firstName;

    @Column
    String secondName;
}
