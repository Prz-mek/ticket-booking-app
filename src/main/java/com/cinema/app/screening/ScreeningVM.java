package com.cinema.app.screening;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScreeningVM {

    private Long id;
    private String title;
    private LocalDateTime startTime;

    public ScreeningVM(Screening screening) {
        this.id = screening.getId();
        this.title = screening.getMovie().getTitle();
        this.startTime = screening.getStartTime();
    }
}
