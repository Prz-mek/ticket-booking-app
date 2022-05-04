package com.cinema.app.reservation;

import com.cinema.app.screening.Screening;
import com.cinema.app.ticket.Ticket;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reservation")
@Data
public class Reservation {
    @Id
    @SequenceGenerator(name = "reservation_sequence", sequenceName = "reservation_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_sequence")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening screening;

    @OneToMany
    @JoinColumn(name = "reservation_id")
    private List<Ticket> tickets;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;
}
