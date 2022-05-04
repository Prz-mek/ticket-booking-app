package com.cinema.app.screening;

import com.cinema.app.seat.SeatDAO;
import lombok.Data;

import java.util.List;


@Data
public class ScreeningFilterVM {

    private Long id;
    private String title;
    private List<SeatDAO> availableSeats;
}