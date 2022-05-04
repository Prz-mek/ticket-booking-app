package com.cinema.app.seat;

import com.cinema.app.room.Room;
import com.cinema.app.ticket.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    @Id
    @SequenceGenerator(name = "seat_sequence", sequenceName = "seat_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_sequence")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany
    @JoinColumn(name = "seat_id")
    private List<Ticket> tickets;

    @Column(name = "number_in_row")
    private Integer numberInRow;

    @Column(name = "seats_row")
    private Integer row;
}
