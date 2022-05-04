package com.cinema.app.room;

import com.cinema.app.screening.Screening;
import com.cinema.app.seat.Seat;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Room {

    @Id
    @SequenceGenerator(name = "room_sequence", sequenceName = "room_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_sequence")
    private Long id;

    @OneToMany
    @JoinColumn(name = "room_id")
    private List<Screening> screenings;

    @OneToMany
    @JoinColumn(name = "room_id")
    private List<Seat> seats;
}
