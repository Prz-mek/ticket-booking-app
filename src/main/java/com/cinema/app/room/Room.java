package com.cinema.app.room;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Room {
    @Id
    @SequenceGenerator(name = "room_sequence", sequenceName = "room_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_sequence")
    Long id;
}
