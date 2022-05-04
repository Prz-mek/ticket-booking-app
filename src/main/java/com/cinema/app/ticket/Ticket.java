package com.cinema.app.ticket;

import com.cinema.app.reservation.Reservation;
import com.cinema.app.seat.Seat;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

    @Id
    @SequenceGenerator(name = "ticket_sequence", sequenceName = "ticket_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_sequence")
    private Long id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TicketType type;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
