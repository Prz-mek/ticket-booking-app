package com.cinema.app.movie;

import com.cinema.app.reservation.Reservation;
import com.cinema.app.room.Room;
import com.cinema.app.screening.Screening;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @SequenceGenerator(name = "movie_sequence", sequenceName = "movie_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_sequence")
    private Long id;

    @OneToMany
    @JoinColumn(name = "movie_id")
    private List<Screening> screenings;

    @Column(name = "title")
    private String title;
}
