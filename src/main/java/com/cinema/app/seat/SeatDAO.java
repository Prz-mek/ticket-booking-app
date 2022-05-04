package com.cinema.app.seat;

public class SeatDAO {
    private Long id;
    private Integer numberInRow;
    private Integer row;

    public SeatDAO(Seat seat) {
        this.id = seat.getId();
        this.numberInRow = seat.getNumberInRow();
        this.row = seat.getRow();
    }
}
